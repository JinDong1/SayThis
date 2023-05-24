package com.say.utils.excel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.GlobalConfiguration;
import com.alibaba.excel.metadata.data.ReadCellData;
import com.alibaba.excel.metadata.data.WriteCellData;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import com.alibaba.excel.write.builder.ExcelWriterBuilder;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.fill.FillConfig;
import com.alibaba.excel.write.style.column.LongestMatchColumnWidthStyleStrategy;
import com.say.utils.excel.model.ShellData;
import com.say.utils.excel.strategy.ExcelFillCellLineMergeHandler;
import com.say.utils.excel.strategy.MergeStrategy;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Excel相关处理
 */
@Log4j2
public class ExcelUtils {

    /**
     * 设置web响应输出的文件名称
     * @param response web响应
     * @param fileName 导出文件名称
     */
    private static void setResponseHeader(HttpServletResponse response, String fileName) {
        response.reset();
        response.setContentType("application/vnd.ms-excel;charset=utf-8");
        try {
            response.setHeader("Content-Disposition", "attachment;filename=" +
                    URLEncoder.encode(fileName + ".xlsx", "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            log.error("不支持的编码", e.getLocalizedMessage());
        }
        response.setCharacterEncoding("UTF-8");
    }

    public static void exportStudedntExcel(HttpServletResponse response, HashMap<String,Object> datas,String fileName) throws IOException{


        setResponseHeader(response, fileName);
        //未获取到数据时
        if (datas.get("data") == null){
            return;
        }
        ExcelWriter workbook= null;
        BufferedOutputStream bos = new BufferedOutputStream(response.getOutputStream());
        try{
            String template="student_fill_template.xlsx";
            //日期转化格式字符串
            workbook = EasyExcel.write(bos).withTemplate(template).build();

            WriteSheet sheet = EasyExcel.writerSheet("Sheet1").build();
            FillConfig fillConfig = FillConfig.builder().forceNewRow(true).build();

            //填充议题数据
            workbook.fill(datas.get("data"),fillConfig,sheet);

            //datas.remove("data");
            //获取副标题及角标
            HashMap<String,Object> map = new LinkedHashMap<>();
            map.put("schoolclass",datas.get("schoolclass"));
            map.put("exporttime",datas.get("exporttime"));
            //填充角标及标题数据
            workbook.fill(map,sheet);
        }catch (Throwable ex){
            ex.getMessage();
        }finally {
            bos.flush();
            if (workbook != null){
                workbook.finish();
            }
        }
    }



    /**
     * 同步导入(适用于小数据量)
     *
     * @param is 输入流
     * @return 转换后集合
     */
    public static <T> List<T> importExcel(InputStream is, Class<T> clazz) {
        return EasyExcel.read(is).head(clazz).autoCloseStream(false).sheet().doReadSync();
    }

    /**
     * 导出excel
     *
     * @param list     导出数据集合
     * @param filename 工作表的名称
     * @return 结果
     */
    public static <T> void exportExcel(List<T> list, String filename, Class<T> clazz, HttpServletResponse response) {
        try {
            response.reset();
            setAttachmentResponseHeader(response, filename);
            response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=UTF-8");
            ServletOutputStream os = response.getOutputStream();
            EasyExcel.write(os, clazz).autoCloseStream(false)
                    // 自动适配
                    .registerWriteHandler(new LongestMatchColumnWidthStyleStrategy())
                    // 大数值自动转换 防止失真
                    .registerConverter(new ExcelBigNumberConvert()).sheet(filename).doWrite(list);
        } catch (IOException e) {
            throw new RuntimeException("导出Excel异常", e);
        }
    }

    /**
     * 导出多个sheet到一个excel文件  支持模板和直接创建
     */
    public static void exportExcel(ExcelData excelData, HttpServletResponse response) {
        ExcelWriter excelWriter = null;
        try {
            String filename = excelData.getFilename();
            response.reset();
            setAttachmentResponseHeader(response, filename);
            response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=UTF-8");
            ByteArrayOutputStream bos = new ByteArrayOutputStream();

            ServletOutputStream os = response.getOutputStream();
            ExcelWriterBuilder writerBuilder = EasyExcelFactory.write(os).autoCloseStream(false)
                    //注册自定义合并单元格策略
                    .registerWriteHandler(new ExcelFillCellLineMergeHandler(1, new int[]{0,1,2}))
                    // 大数值自动转换 防止失真
                    .registerConverter(new ExcelBigNumberConvert());
            if (excelData.getTemplateFile() != null) {
                writerBuilder.withTemplate(excelData.getTemplateFile());
            }
            excelWriter = writerBuilder.build();
            if (excelData.getTemplateFile() != null) {
                // 注意sheet名称要与模板文件的sheet名称一一对应
                for (ShellData<?> shellData : excelData.getShellDataList()) {
                    WriteSheet writeSheet = EasyExcel.writerSheet(shellData.getSheetName()).build();
                    excelWriter.fill(shellData.getList(), writeSheet);
                }
            } else {
                //开始写入excel
                for (ShellData<?> shellData : excelData.getShellDataList()) {
                    WriteSheet writeSheet = EasyExcel.writerSheet(shellData.getSheetName()).head(shellData.getClazz()).build();
                    excelWriter.write(shellData.getList(), writeSheet);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("导出Excel异常", e);
        } finally {
            // 千万别忘记finish 会帮忙关闭流
            if (excelWriter != null) {
                excelWriter.finish();
            }
        }
    }

    /**
     * 导出多个sheet到多个excel文件，并压缩到一个zip文件 支持模板和直接创建
     */
    public static void exportZip(String zipFilename, List<ExcelData> excelDataList, HttpServletResponse response) {
        if (zipFilename == null || zipFilename.isEmpty()) {
            zipFilename = "export";
        } else if (zipFilename.toLowerCase(Locale.ROOT).endsWith(".zip")) {
            zipFilename = zipFilename.substring(0, zipFilename.length() - 4);
        }
        if (excelDataList == null || excelDataList.isEmpty()) {
            throw new RuntimeException("导出数据为空！");
        }
        try {
            // 这里URLEncoder.encode可以防止中文乱码
            zipFilename = URLEncoder.encode(zipFilename, "utf-8");
            response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + zipFilename + ".zip");
            response.setContentType("application/x-msdownload");
            response.setCharacterEncoding("utf-8");
            //开始存入
            try (ZipOutputStream zipOut = new ZipOutputStream(response.getOutputStream())) {
                try {
                    for (ExcelData excelData : excelDataList) {
                        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                        ExcelWriter excelWriter = null;
                        try {
                            ExcelWriterBuilder builder = EasyExcel.write(outputStream).autoCloseStream(false)
                                    // 自动适配
                                    .registerWriteHandler(new LongestMatchColumnWidthStyleStrategy())
                                    // 大数值自动转换 防止失真
                                    .registerConverter(new ExcelBigNumberConvert());
                            if (excelData.getTemplateFile() != null) {
                                builder.withTemplate(excelData.getTemplateFile());
                            }
                            excelWriter = builder.build();
                            zipOut.putNextEntry(new ZipEntry(excelData.getFilename()));
                            if (excelData.getTemplateFile() != null) {
                                for (ShellData<?> shellData : excelData.getShellDataList()) {
                                    WriteSheet writeSheet = EasyExcel.writerSheet(shellData.getSheetName()).build();
                                    //FillConfig fillConfig = FillConfig.builder().forceNewRow(Boolean.TRUE).build();
                                    excelWriter.fill(shellData.getList(), writeSheet);
                                }
                            } else {
                                //开始写入excel
                                for (ShellData<?> shellData : excelData.getShellDataList()) {
                                    WriteSheet writeSheet = EasyExcel.writerSheet(shellData.getSheetName()).head(shellData.getClazz()).build();
                                    excelWriter.write(shellData.getList(), writeSheet);
                                }
                            }
                        } catch (Exception e) {
                            throw new RuntimeException("导出Excel异常", e);
                        } finally {
                            if (excelWriter != null) {
                                excelWriter.finish();
                            }
                        }
                        outputStream.writeTo(zipOut);
                        zipOut.closeEntry();
                    }

                } catch (Exception e) {
                    throw new RuntimeException("导出Excel异常", e);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("导出Excel异常", e);
        }
    }

    private static void setAttachmentResponseHeader(HttpServletResponse response, String filename) throws UnsupportedEncodingException {
        String encode = URLEncoder.encode(filename, StandardCharsets.UTF_8.toString());
        String percentEncodedFileName = encode.replaceAll("\\+", "%20");
        String contentDispositionValue = "attachment; filename=" +
                percentEncodedFileName + ";filename*=utf-8''" +
                percentEncodedFileName;

        response.addHeader("Access-Control-Expose-Headers", "Content-Disposition,download-filename");
        response.setHeader("Content-disposition", contentDispositionValue);
        response.setHeader("download-filename", percentEncodedFileName);
    }

    /**
     * Excel 数值长度位15位 大于15位的数值转换位字符串
     */
    public static class ExcelBigNumberConvert implements Converter<Long> {

        @Override
        public Class<Long> supportJavaTypeKey() {
            return Long.class;
        }

        @Override
        public CellDataTypeEnum supportExcelTypeKey() {
            return CellDataTypeEnum.STRING;
        }

        @Override
        public Long convertToJavaData(ReadCellData<?> cellData, ExcelContentProperty contentProperty, GlobalConfiguration globalConfiguration) {
            Object data = cellData.getData();
            if (data == null) {
                return null;
            }
            String s = String.valueOf(data);
            if (s.matches("^\\d+$")) {
                return Long.parseLong(s);
            }
            return null;
        }

        @Override
        public WriteCellData<Object> convertToExcelData(Long object, ExcelContentProperty contentProperty, GlobalConfiguration globalConfiguration) {
            if (object != null) {
                String str = object.toString();
                if (str.length() > 15) {
                    return new WriteCellData<>(str);
                }
            }
            WriteCellData<Object> cellData = new WriteCellData<>(new BigDecimal(object));
            cellData.setType(CellDataTypeEnum.NUMBER);
            return cellData;
        }

    }

    /**
     * excel数据
     */
    public static class ExcelData {

        Map<String,Object> map = new HashMap<>();
        private List<ShellData<?>> shellDataList = new ArrayList<>();
        private String filename = "export.xlsx";
        private String templateFilename;

        public List<ShellData<?>> getShellDataList() {
            return shellDataList;
        }

        public void setFilename(String filename) {
            this.filename = filename;
        }

        public String getTemplateFilename() {
            return templateFilename;
        }

        public void setTemplateFilename(String templateFilename) {
            this.templateFilename = templateFilename;
        }

        public File getTemplateFile() {
            if (templateFilename == null) {
                return null;
            }
            File templateFile = new File(templateFilename);
            if (templateFile.exists() && templateFile.isFile()) {
                return templateFile;
            }
            Resource resource = new ClassPathResource(templateFilename);
            if (resource.exists()) {
                File file = null;
                try {
                    file = resource.getFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (file != null) {
                    if (file.exists() && file.isFile()) {
                        return file;
                    }
                    return null;
                }
            }
            return null;
        }

        public void setShellDataList(List<ShellData<?>> shellDataList) {
            if (shellDataList != null) {
                this.shellDataList = shellDataList;
            }
        }

        public String getFilename() {
            if (filename == null || filename.isEmpty()) {
                filename = "export.xlsx";
            } else {
                String fn = filename.toLowerCase(Locale.ROOT);
                if (!(fn.endsWith(".xlsx") || fn.endsWith(".xls"))) {
                    filename = filename + ".xlsx";
                }
            }
            return filename;
        }

        public void addShellData(ShellData<?> shellData) {
            this.shellDataList.add(shellData);
        }
    }


}

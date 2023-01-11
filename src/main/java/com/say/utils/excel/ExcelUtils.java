package com.say.utils.excel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.builder.ExcelWriterBuilder;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.style.column.LongestMatchColumnWidthStyleStrategy;
import com.say.utils.excel.model.ExcelBigNumberConvert;
import com.say.utils.excel.model.ExcelData;
import com.say.utils.excel.model.ExcelShellData;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ExcelUtils {

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
            ServletOutputStream os = response.getOutputStream();
            ExcelWriterBuilder writerBuilder = EasyExcel.write(os).autoCloseStream(false)
                    // 自动适配
                    .registerWriteHandler(new LongestMatchColumnWidthStyleStrategy())
                    // 大数值自动转换 防止失真
                    .registerConverter(new ExcelBigNumberConvert());
            if (excelData.getTemplateFile() != null) {
                writerBuilder.withTemplate(excelData.getTemplateFile());
            }
            excelWriter = writerBuilder.build();
            if (excelData.getTemplateFile() != null) {
                // 注意sheet名称要与模板文件的sheet名称一一对应
                for (ExcelShellData<?> shellData : excelData.getShellDataList()) {
                    WriteSheet writeSheet = EasyExcel.writerSheet(shellData.getSheetName()).build();
                    //FillConfig fillConfig = FillConfig.builder().forceNewRow(Boolean.TRUE).build();
                    excelWriter.fill(shellData.getList(), writeSheet);
                }
            } else {
                //开始写入excel
                for (ExcelShellData<?> shellData : excelData.getShellDataList()) {
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
     * 导出多个sheet到多个excel文件，并压缩到一个zip文件转成字节流
     */
    public static ByteArrayOutputStream exportZip(String zipFilename, List<ExcelData> excelDataList) {
        if (zipFilename == null || zipFilename.isEmpty()) {
            zipFilename = "export";
        } else if (zipFilename.toLowerCase(Locale.ROOT).endsWith(".zip")) {
            zipFilename = zipFilename.substring(0, zipFilename.length() - 4);
        }
        if (excelDataList == null || excelDataList.isEmpty()) {
            throw new RuntimeException("导出数据为空！");
        }

        ByteArrayOutputStream os = new ByteArrayOutputStream();

        try {
            // 这里URLEncoder.encode可以防止中文乱码
            zipFilename = URLEncoder.encode(zipFilename, "utf-8");
            //开始存入
            try (ZipOutputStream zipOut = new ZipOutputStream(os)) {
                try {
                    for (ExcelData excelData : excelDataList) {
                        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                        ExcelWriter excelWriter = null;
                        try {
                            ExcelWriterBuilder builder = EasyExcel.write(outputStream).autoCloseStream(false)
                                    // 自动适配
                                    //.registerWriteHandler(new LongestMatchColumnWidthStyleStrategy())
                                    // 大数值自动转换 防止失真
                                    .registerConverter(new ExcelBigNumberConvert());
                            if (excelData.getTemplateFile() != null) {
                                builder.withTemplate(excelData.getTemplateFile());
                            }
                            excelWriter = builder.build();
                            zipOut.putNextEntry(new ZipEntry(excelData.getFilename()));
                            if (excelData.getTemplateFile() != null) {
                                for (ExcelShellData<?> shellData : excelData.getShellDataList()) {
                                    WriteSheet writeSheet = EasyExcel.writerSheet(shellData.getSheetName()).build();
                                    //FillConfig fillConfig = FillConfig.builder().forceNewRow(Boolean.TRUE).build();
                                    excelWriter.fill(shellData.getList(), writeSheet);
                                }
                            } else {
                                //开始写入excel
                                for (ExcelShellData<?> shellData : excelData.getShellDataList()) {
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

        return os;
    }

    /***
     * 用户客户端下载zip文件
     * @param zipFilename
     * @param excelDataList
     * @param response
     * @return
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
                                    //.registerWriteHandler(new LongestMatchColumnWidthStyleStrategy())
                                    // 大数值自动转换 防止失真
                                    .registerConverter(new ExcelBigNumberConvert());
                            if (excelData.getTemplateFile() != null) {
                                builder.withTemplate(excelData.getTemplateFile());
                            }
                            excelWriter = builder.build();
                            zipOut.putNextEntry(new ZipEntry(excelData.getFilename()));
                            if (excelData.getTemplateFile() != null) {
                                for (ExcelShellData<?> shellData : excelData.getShellDataList()) {
                                    WriteSheet writeSheet = EasyExcel.writerSheet(shellData.getSheetName()).build();
                                    //FillConfig fillConfig = FillConfig.builder().forceNewRow(Boolean.TRUE).build();
                                    excelWriter.fill(shellData.getList(), writeSheet);
                                }
                            } else {
                                //开始写入excel
                                for (ExcelShellData<?> shellData : excelData.getShellDataList()) {
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






}

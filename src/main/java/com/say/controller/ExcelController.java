package com.say.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.say.commom.core.R;
import com.say.domain.Column;
import com.say.domain.Student;
import com.say.model.SheetModel;
import com.say.utils.Arith;
import com.say.utils.excel.model.ShellData;
import com.say.utils.excel.ExcelUtils;
import lombok.extern.log4j.Log4j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.RequestEntity.head;

@Controller
@RequestMapping("/excel")
@Log4j2
public class ExcelController {



    private static final Logger LOGGER = LoggerFactory.getLogger(ExcelController.class);




    Student student = new Student();

    @PostMapping("/readExcel")
    public  void readExcel(@RequestParam("file") MultipartFile file) throws IOException {

        EasyExcel.read(file.getInputStream(), Column.class, new AnalysisEventListener<Column>() {
            @Override
            public void invoke(Column column, AnalysisContext analysisContext) {

                Integer rowIndex = analysisContext.readRowHolder().getRowIndex();
                if (rowIndex == 0){
                    student.setCl(column.getTwo());
                    student.setName(column.getFour());
                }

                if (rowIndex == 1){
                    student.setSousl(column.getTwo());
                    student.setAge(column.getFour());
                }

                if (rowIndex == 2){
                    student.setDept(column.getTwo());
                    student.setSex(column.getFour());
                }

            }

            @Override
            public void doAfterAllAnalysed(AnalysisContext analysisContext) {
                System.out.println("学生信息：：：："+student);
                // 数据解析完成后的操作
            }
        }).headRowNumber(0).sheet().doRead();


    }














    /**
     * 导入 Excel 文件
     *
     * @param file Excel 文件
     * @return
     * @throws IOException
     */
    @PostMapping("/import")
    public R importExcel(@RequestParam("file") MultipartFile file) throws IOException {

        return R.success();
    }



    @RequestMapping("/download")
    public void exportList(HttpServletResponse response, HttpServletRequest request) {
        //查询数据源
        List<SheetModel> studentList = getStudentList();


        try {
            String fileName = "工作日志";

            String userAgent = request.getHeader("User-Agent");

    /*        if (userAgent.contains(ConstantValue.MSIE) || userAgent.contains(ConstantValue.TRIDENT)) {
                // 针对IE或者以IE为内核的浏览器：
                fileName = java.net.URLEncoder.encode(fileName, "UTF-8");
            } else {*/
                // 非IE浏览器的处理:
                fileName = new String(fileName.getBytes(StandardCharsets.UTF_8), StandardCharsets.ISO_8859_1);
           // }
            response.setContentType("application/vnd.ms-excel");
            response.setHeader("Content-disposition", String.format("attachment; filename=\"%s\"", fileName + ".xlsx"));
            response.setHeader("Cache-Control", "no-cache");
            response.setHeader("Pragma", "no-cache");
            response.setDateHeader("Expires", -1);
            response.setCharacterEncoding("UTF-8");
            EasyExcel.write(response.getOutputStream(), SheetModel.class)
                    .autoCloseStream(Boolean.FALSE)
                    .sheet("导出列表")
                    .doWrite(studentList);
        } catch (Exception e) {
            log.info("导出失败");
        }
    }

    private List getStudentList() {
        List<SheetModel> sheetModels = new ArrayList<>();

        SheetModel.SheetModelBuilder builder = SheetModel.builder();
        for (int i = 1; i < 11; i++) {
            if (i <= 4) {
                builder.index(String.valueOf(1));
                builder.transferNumber("ZKZR-20230417-678");
                builder.contractName("工程-20230417-43398");
                builder.projectOrgName("市万科城市建设管理有限公司");
                builder.supplierName("市委局");
            }else {

                builder.index(String.valueOf(2));
                builder.transferNumber("ZKZR-20230417-679");
                builder.contractName("工程-20230417-43399");
                builder.projectOrgName("万达集团");
                builder.supplierName("万科");
            }
            builder.contractCode("施工-20230417-3292"+i);
            builder.invoiceNo("WFXK569921");
            builder.invoiceAmount(BigDecimal.valueOf(randomDouble(1, 20)));

            sheetModels.add(builder.build());
        }
        return sheetModels;
    }


    // 导出到一个压缩文件 包含两个excel，其中一个包含两个sheet，另一个使用模块
    @GetMapping("/export/zip")
    public void exportZip(HttpServletResponse response) {
        List<ExcelUtils.ExcelData> excelData = exportAllData();
        ExcelUtils.exportZip("压缩导出", excelData, response);
    }

    // 导出到一个excel文件 包含两个sheet
    @GetMapping("/export")
    public void exportExcel(HttpServletResponse response) {
        List<ExcelUtils.ExcelData> excelData = exportAllData();
        ExcelUtils.ExcelData excelA = excelData.get(0);//只要excelA
        ExcelUtils.exportExcel(excelA, response);
    }



    // 构建数据 Excel1Sheet1和Excel1Sheet2分别是excelA的两个sheet的数据，Excel2Sheet1是excelB的数据
    public List<ExcelUtils.ExcelData> exportAllData() {
        List<ExcelUtils.ExcelData> excelDataList = new ArrayList<>();
        //excelA
        ExcelUtils.ExcelData excelA = new ExcelUtils.ExcelData();
        excelA.setFilename("占比测算分析"+System.currentTimeMillis());
        excelA.setTemplateFilename("temp/test230414.xlsx");
        //excelA->Excel1Sheet1
        List<SheetModel> sheetModels = new ArrayList<>();

        SheetModel.SheetModelBuilder builder = SheetModel.builder();
        for (int i = 1; i < 11; i++) {
            if (i <= 4) {
                builder.index(String.valueOf(1));
                builder.transferNumber("ZKZR-20230417-678");
                builder.contractName("工程-20230417-43398");
                builder.projectOrgName("市万科城市建设管理有限公司");
                builder.supplierName("市委局");
            }else {

                builder.index(String.valueOf(2));
                builder.transferNumber("ZKZR-20230417-679");
                builder.contractName("工程-20230417-43399");
                builder.projectOrgName("万达集团");
                builder.supplierName("万科");
            }
            builder.contractCode("施工-20230417-3292"+i);
            builder.invoiceNo("WFXK569921");
            builder.invoiceAmount(BigDecimal.valueOf(randomDouble(1, 20)));

            sheetModels.add(builder.build());
        }


        excelA.addShellData(new ShellData<>(sheetModels, "占比测算分析", SheetModel.class));

        excelDataList.add(excelA);

        return excelDataList;
    }




    /**
     * 获取大于等于min，小于max的随机整数
     * @param min
     * @param max
     * @return
     */
    private static double randomDouble(int min, int max){
        return   Arith.round((Math.random() * (max - min)) + min, 2);
    }


}

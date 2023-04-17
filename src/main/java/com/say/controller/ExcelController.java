package com.say.controller;

import com.say.model.SheetModel;
import com.say.utils.Arith;
import com.say.utils.excel.model.ShellData;
import com.say.utils.excel.ExcelUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/excel")
public class ExcelController {


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

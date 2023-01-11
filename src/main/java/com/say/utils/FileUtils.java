//package com.say.utils;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//public class FileUtils {
//
//
//    public void export(HttpServletRequest request, HttpServletResponse response) {
//
//        response.setContentType("text/html");
//
//        Workbook wb;
//
//        File file = null;
//
//        try {
//
//            // 模板路径
//
//            String xlsTemplatePath = "";
//
//            Date date = new Date();
//
//            SimpleDateFormat sdf = new SimpleDateFormat("MMdd");
//
//            String fileName = "";
//
//            String time = sdf.format(date);
//
//            xlsTemplatePath = webDownloadPath + "//report.xlsx";//webDownloadPath在yml中配置
//
//            fileName = "导出模板_" + time;
//
//
//
//            file = ResourceUtils.getFile(xlsTemplatePath);
//
//
//
//            // 获取文件输入流
//
//            InputStream inputStream = new FileInputStream(file);
//
//
//
//            Workbook wbPartModule = null;
//
//            if(xlsTemplatePath.endsWith(".xlsx")){
//
//                wbPartModule = new XSSFWorkbook(inputStream);
//
//            }else if(xlsTemplatePath.endsWith(".xls")){
//
//                wbPartModule = new HSSFWorkbook(inputStream);
//
//            }
//
//            inputStream.close();
//
//            wb = wbPartModule;
//
//
//
//            // 设置response参数，可以打开下载页面
//
//            response.reset();
//
//            // xlsx 下载
//
//            response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
//
//            // xls 下载
//
//            response.addHeader("Content-Disposition", "attachment;filename=" + new String(fileName.getBytes("gb2312"), "ISO-8859-1") + ".xlsx");
//
//            // 导出excel
//
//            OutputStream out = response.getOutputStream();
//
//            ExcelUtil.exportExcel(wb, out);
//
//        } catch (Exception e) {
//
//            e.printStackTrace();
//
//        }
//
//    }
//
//}

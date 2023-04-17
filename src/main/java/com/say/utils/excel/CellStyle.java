package com.say.utils.excel;

import com.alibaba.excel.write.metadata.style.WriteCellStyle;
import com.alibaba.excel.write.metadata.style.WriteFont;
import com.alibaba.excel.write.style.HorizontalCellStyleStrategy;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.VerticalAlignment;

public class CellStyle {

    public static HorizontalCellStyleStrategy getCellCenterStyle() {
        WriteCellStyle headWriteCellStyle = new WriteCellStyle();
        //设置背景颜色head
        headWriteCellStyle.setFillForegroundColor(IndexedColors.WHITE.getIndex());
        //设置头字体
         WriteFont headWriteFont = new WriteFont();
         headWriteFont.setFontHeightInPoints((short)13);
         headWriteFont.setBold(true);headWriteCellStyle.setWriteFont(headWriteFont);
        // 设置头居中
         headWriteCellStyle.setHorizontalAlignment(HorizontalAlignment.CENTER);
        // 内容策略
         WriteCellStyle contentWriteCellStyle = new WriteCellStyle();
        // 设置 水平居中
         contentWriteCellStyle.setHorizontalAlignment(HorizontalAlignment.CENTER);
        // 设置 垂直居中
         contentWriteCellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
        return new HorizontalCellStyleStrategy(headWriteCellStyle, contentWriteCellStyle);

    }
}
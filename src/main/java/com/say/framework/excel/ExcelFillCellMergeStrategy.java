package com.say.framework.excel;

import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.write.merge.AbstractMergeStrategy;
import lombok.Data;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;

import java.util.List;

/**
 *  easyexcel合并行列导出
 */
@Data
public class ExcelFillCellMergeStrategy extends AbstractMergeStrategy {

    /**
     * 分组，每几行合并一次
     */
    private List<Integer> exportFieldGroupCountList;

    /**
     * 目标合并列index
     */
    private Integer targetColumnIndex;

    // 需要开始合并单元格的首行index
    private Integer rowIndex;

    public ExcelFillCellMergeStrategy(){

    }

    // exportDataList为待合并目标列的值
    public ExcelFillCellMergeStrategy(List<Integer> exportFieldGroupCountList, Integer targetColumnIndex) {
        this.exportFieldGroupCountList = exportFieldGroupCountList;
        this.targetColumnIndex = targetColumnIndex;
    }

    @Override
    protected void merge(Sheet sheet, Cell cell, Head head, Integer integer) {
        if (null == rowIndex) {
            rowIndex = cell.getRowIndex();
        }
        // 只有合并的行与标记行相对应时才进行合并
        if (cell.getRowIndex() == rowIndex && cell.getColumnIndex() == targetColumnIndex) {
            mergeGroupColumn(sheet);
        }
    }

    private void mergeGroupColumn(Sheet sheet) {
        int rowCount = rowIndex;
        for(Integer count:exportFieldGroupCountList){
            // 1行调用合并方法会报错
            if(count == 1){
                continue;
            }
            // 合并单元格
            CellRangeAddress cellAddresses = new CellRangeAddress(rowCount,rowCount+count-1,targetColumnIndex,targetColumnIndex);
            sheet.addMergedRegion(cellAddresses);
            rowCount += count;
        }
    }


}

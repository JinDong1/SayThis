package com.say.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;


@Data
public class Column {
    @ExcelProperty(index = 0)
    private String one;

    @ExcelProperty(index = 1)
    private String two;

    @ExcelProperty(index = 2)
    private String Column;

    @ExcelProperty(index = 3)
    private String four;




}

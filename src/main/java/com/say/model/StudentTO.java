package com.say.model;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

@Data
public class StudentTO {

    @Excel(name = "姓名")
    private String name;

    @Excel(name = "性别")
    private String sex;

    @Excel(name = "年龄")
    private String age;
}

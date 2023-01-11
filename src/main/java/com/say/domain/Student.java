package com.say.domain;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 
 * @TableName student
 */
@TableName(value ="student")
@Data
@Entity
public class Student implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    @Id
    private Integer id;

    /**
     * 
     */
    @Excel(name = "姓名")
    private String name;

    /**
     * 
     */
    @Excel(name = "性别")
    private String sex;

    /**
     * 
     */
    @Excel(name = "年龄")
    private Integer age;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
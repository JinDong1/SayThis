package com.say.commom.core;


import java.io.Serializable;
import java.util.List;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import lombok.Data;

@Data
public class PageRequest<T> implements Serializable {
    // 当前页码
    private Integer pageNum;
    // 每页条数
    private Integer pageSize;
    // 关键字
    private String keyword;
    // 排序规则
    private List<OrderItem> orders;
    // 查询的字段
    private List<String> selectColumns;
    // 自定义条件
    private T condition;

}
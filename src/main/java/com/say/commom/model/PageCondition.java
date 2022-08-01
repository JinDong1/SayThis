package com.say.commom.model;

import lombok.Data;

@Data
public class PageCondition<T> {

    /**
     * 当前页面
     */
    private Integer current = 1;

    /**
     * 当前月
     */
    private Integer size = 10;


    private T obj;


}

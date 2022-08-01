package com.say.commom.excelpion;

/**
 * 异常處理
 **/
@FunctionalInterface
public interface ThrowExceptionFunction {


    /**
     * 抛出异常信息
     *
     * @param message 异常信息
     **/
    void throwMessage(String message);


}

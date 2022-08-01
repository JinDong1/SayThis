package com.say.utils;

import com.say.commom.excelpion.ThrowExceptionFunction;
import com.say.web.exception.ServiceException;

public class FunctionUtils {

    /**
     * 业务异常响应
     */
    public static ThrowExceptionFunction isTure(boolean b) {

        return (errorMessage) -> {
            if (b) {
                throw new ServiceException(errorMessage);
            }
        };
    }


}

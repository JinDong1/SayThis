package com.say.config;

import com.say.service.GrantTypeSerive;
import com.say.utils.FunctionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Component
public class QueryGrantTypeService {


    private final Map<String, Function<String, String>> grantTypeMap = new HashMap<>();
    @Autowired
    private GrantTypeSerive grantTypeSerive;

    /**
     * 初始化业务分派逻辑,代替了if-else部分
     * key: 优惠券类型
     * value: lambda表达式,最终会获得该优惠券的发放方式
     */
    @PostConstruct
    public void dispatcherInit() {
        grantTypeMap.put("红包", resourceId -> grantTypeSerive.redPaper(resourceId));
        grantTypeMap.put("购物券", resourceId -> grantTypeSerive.shopping(resourceId));
        grantTypeMap.put("qq会员", resourceId -> grantTypeSerive.QQVip(resourceId));
    }

    public String getResult(String resourceType) {
        //Controller根据 优惠券类型resourceType、编码resourceId 去查询 发放方式grantType

        Function<String, String> result = grantTypeMap.get(resourceType);

        FunctionUtils.isTure(result == null).throwMessage("查询不到该优惠券的发放方式");

        return result.apply("22");
    }

}

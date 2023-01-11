package com.say.config;

import com.say.service.GrantTypeSerive;
import com.say.service.impl.LedgerWarehousingService;
import com.say.utils.FunctionUtils;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;


@Component
public class AccountHandle {


    private   final Map<String, Consumer<MultipartFile>> accountTypeMap = new HashMap<>();
    @Autowired
    private LedgerWarehousingService ledgerWarehousingService;

    /**
     * 初始化业务分派逻辑,代替了if-else部分
     * key: 文件名称
     * value: 文件
     */
    @PostConstruct
    public void dispatcherInit() {
         accountTypeMap.put("student", multipartFile -> ledgerWarehousingService.batchBave(multipartFile));

    }

    public void handleResult(String fileName,MultipartFile file) {

        //根据文件名称匹配对应的入库方式
        Consumer<MultipartFile> multipartFileConsumer = accountTypeMap.get(fileName);

        FunctionUtils.isTure(multipartFileConsumer == null).throwMessage("未查询到台账处理方案");

        multipartFileConsumer.accept(file);
    }

}

package com.say.config;

import com.say.service.GrantTypeSerive;
import com.say.service.SysUserService;
import com.say.service.impl.LedgerWarehousingService;
import com.say.utils.FunctionUtils;
import com.say.utils.StringUtils;
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
     * 初始化业务分派逻辑
     * key: 文件名称
     * value: 文件
     */
    @PostConstruct
    public void dispatcherInit() {
         accountTypeMap.put("student", multipartFile -> ledgerWarehousingService.batchBaveStudent(multipartFile));
         accountTypeMap.put("amt", multipartFile -> ledgerWarehousingService.batchBaveAmt(multipartFile));
         accountTypeMap.put("cds", multipartFile -> ledgerWarehousingService.batchBaveCds(multipartFile));
         accountTypeMap.put("fx", multipartFile -> ledgerWarehousingService.batchBaveFx(multipartFile));
         accountTypeMap.put("irs", multipartFile -> ledgerWarehousingService.batchBaveIrs(multipartFile));
         accountTypeMap.put("ndirs", multipartFile -> ledgerWarehousingService.batchBaveNdirs(multipartFile));
         accountTypeMap.put("trad", multipartFile -> ledgerWarehousingService.batchBaveTrad(multipartFile));
         accountTypeMap.put("trs", multipartFile -> ledgerWarehousingService.batchBaveTrs(multipartFile));
    }

    public void handleResult(String fileName,MultipartFile file) {
        //根据文件名称匹配对应的入库方式
        Consumer<MultipartFile> multipartFileConsumer = accountTypeMap.get(fileName);

        FunctionUtils.isTure(StringUtils.isNull(multipartFileConsumer)).throwMessage(fileName+"==>>未匹配到台账处理方案");

        if (StringUtils.isNotNull(multipartFileConsumer)){
            multipartFileConsumer.accept(file);
        }

    }

}

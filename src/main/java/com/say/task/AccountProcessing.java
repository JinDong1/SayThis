package com.say.task;


import com.say.config.AccountHandle;
import com.say.service.impl.AccountAnalysisService;
import com.say.utils.zip.FileParsingUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;

/**
 * 台账处理
 */
@Service
public class AccountProcessing {

    @Autowired
    private AccountHandle accountHandle;

    @Autowired
    private AccountAnalysisService accountAnalysisService;

    public void accountSourceDataWarehousing(HttpServletResponse response)  {
        //台账源数据入库
        FileParsingUtil.fileToMultipartFile().forEach((k, v)-> accountHandle.handleResult(k,v));

        //数据导出
        accountAnalysisService.excelExport();



    }






}

package com.say.controller;


import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.excel.write.metadata.WriteTable;
import com.say.commom.core.R;
import com.say.domain.Student;
import com.say.mapper.StudentMapper;
import com.say.task.AccountProcessing;
import com.say.web.exception.ServiceException;
import lombok.AllArgsConstructor;
import org.apache.poi.ss.usermodel.Workbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

@RestController
@RequestMapping
public class Index {

    Logger log = LoggerFactory.getLogger(Index.class);



    @Autowired
   private AccountProcessing accountProcessing;

    @GetMapping
    public R index() {
        return R.success("萨瓦迪卡");
    }



    @Autowired
    private StudentMapper studentMapper;

    @GetMapping("/account")
    public void account(HttpServletResponse response){
        accountProcessing.accountSourceDataWarehousing(response);
    }



}

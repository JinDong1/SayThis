package com.say.service.impl;


import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.excel.entity.result.ExcelImportResult;
import com.say.domain.Student;
import com.say.mapper.StudentMapper;
import com.say.utils.FunctionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.beans.Transient;

@Component
public class LedgerWarehousingService {

    @Autowired
    private StudentMapper studentMapper;

    @Transient
    public void batchBave(MultipartFile file)  {

        ImportParams params = new ImportParams();
        // 表头设置有几行0
        params.setHeadRows(1);
        // 标题行设置为0行，默认是0，可以不设置
        params.setTitleRows(0);

        ExcelImportResult<Student> result;
        try {
          result = ExcelImportUtil.importExcelMore(file.getInputStream()
                    , Student.class, params);
        }catch (Exception e){
            throw new RuntimeException(e);
        }

        int i = studentMapper.batchBave(result.getList());

        FunctionUtils.isTure(i == 0).throwMessage("Student.class台账源数据入库失败");


    }


}

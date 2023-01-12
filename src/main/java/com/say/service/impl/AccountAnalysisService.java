package com.say.service.impl;


import com.say.domain.Student;
import com.say.mapper.StudentMapper;
import com.say.utils.excel.ExcelUtils;
import com.say.utils.excel.model.ExcelData;
import com.say.utils.excel.model.ExcelShellData;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mail.MailProperties;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 台账解析
 */
@Service
public class AccountAnalysisService {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private MailProperties mailProperties;






    // 构建数据 Excel1Sheet1和Excel1Sheet2分别是excelA的两个sheet的数据，Excel2Sheet1是excelB的数据
    public List<ExcelData> exportAllData() {

        //员工信息  平均成绩
        List<Student> students = studentMapper.selectList(null);


        List<ExcelData> excelDataList = new ArrayList<>();
         /* //excelA
        ExcelData excelA = new ExcelData();
        excelA.setFilename("FX Arbitrage PNL");
        //excelA->Excel1Sheet1
        excelA.addShellData(new ExcelShellData<>(students, "Excel1Sheet1", Student.class));
        //excelA->Excel1Sheet2
        excelA.addShellData(new ExcelShellData<>(students, "Excel1Sheet2", Student.class));
        excelDataList.add(excelA);*/

        //excelB
        ExcelData excelB = new ExcelData();
        excelB.setFilename("excelB");//设置excelB的文件名
        String templateFileName = Objects.requireNonNull(this.getClass().getResource("/student.xlsx")).getPath();
        excelB.setTemplateFilename(templateFileName);//设置excelB的模板
        //excelB-Excel2Sheet1
        excelB.addShellData(new ExcelShellData<>(students, "学生信息", Student.class));//设置excelB的sheet数据
        excelB.addShellData(new ExcelShellData<>(students, "部门信息", Student.class));//设置excelB的sheet数据
        excelDataList.add(excelB);


        return excelDataList;
    }

    public void excelExport(HttpServletResponse response)  {

        List<ExcelData> excelData = exportAllData();
        ExcelUtils.exportZip("压缩导出", excelData,response);

        //发送邮箱
   //     email(os.toByteArray());


    }

    @SneakyThrows
    public  void email(byte[] attachment) {
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setFrom(mailProperties.getUsername());
        helper.setTo(new String[]{"793594285@qq.com","541970950@qq.com"});
        helper.setText("内容：花名册");
        helper.setSubject("主题：学生信息");
        // 附件
        helper.addAttachment("二年级二班花名册.zip", new ByteArrayResource(attachment));
        javaMailSender.send(message);
    }





}

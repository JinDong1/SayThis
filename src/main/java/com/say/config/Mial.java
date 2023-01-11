package com.say.config;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mail.MailProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.internet.MimeMessage;

@Configuration
public class Mial {


    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private MailProperties mailProperties;



    @SneakyThrows
    public  void email(byte[] attachment) {
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setFrom(mailProperties.getUsername());
        helper.setTo("793594285@qq.com");
        helper.setText("内容：花名册");
        helper.setSubject("主题：学生信息");
        // 附件
        helper.addAttachment("二年级二班花名册.xlsx", new ByteArrayResource(attachment));
        javaMailSender.send(message);
    }

}

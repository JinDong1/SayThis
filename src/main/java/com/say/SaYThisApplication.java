package com.say;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan(basePackages = {"com.say.mapper"})
@EnableScheduling
public class SaYThisApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SaYThisApplication.class, args);
        Environment environment = context.getBean(Environment.class);
        System.out.println("访问链接：http://localhost:" + environment.getProperty("server.port"));
    }

}

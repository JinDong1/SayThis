package com.say.controller;

import com.say.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.condition.PatternsRequestCondition;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@RestController
@RequestMapping("getAllApi")
public class GetAllApiController {

   @Autowired
   private WebApplicationContext applicationContext;


    @GetMapping("/getApi")
    public void getApi(){

        RequestMappingHandlerMapping mapping = applicationContext.getBean(RequestMappingHandlerMapping.class);
        // 拿到Handler适配器中的全部方法
        Map<RequestMappingInfo, HandlerMethod> methodMap = mapping.getHandlerMethods();

        List<String> urls = new ArrayList<>();

        methodMap.forEach((k,v)->{

            String api = v.toString();

            urls.add(api);

        });

        List<String> list = urls.stream().filter(Objects::nonNull).filter(o -> !o.contains("HttpServletRequest")).collect(Collectors.toList());

        System.out.println(list);

        writeFile(urls);

    }



    /**
     * 写入TXT文件
     */
    public static void writeFile(List<String>  urlList) {
        try {

            File writeName = new File("D:\\api.txt"); // 相对路径，如果没有则要建立一个新的output.txt文件
            writeName.createNewFile(); // 创建新文件,有同名的文件的话直接覆盖
            try (FileWriter writer = new FileWriter(writeName);
                 BufferedWriter out = new BufferedWriter(writer)
            ) {
                for (String s : urlList) {
                    out.write(s+"\r\n"); // \r\n即为换行
                    out.flush(); // 把缓存区内容压入文件
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

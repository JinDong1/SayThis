package com.say.utils;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

public class YmlUtils {


    public static Properties getXMlFile() throws IOException {
        //jdbc.properties必须存在src目录下面
        EncodedResource encodedResource = new EncodedResource(new ClassPathResource("application.yml"), "UTF-8");
        //读取properties文件的值
        return PropertiesLoaderUtils.loadProperties(encodedResource);
    }

    public static void main(String[] args) throws IOException {
        Properties xMlFile = getXMlFile();
        System.out.println(xMlFile);
    }
}

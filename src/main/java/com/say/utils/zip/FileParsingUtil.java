package com.say.utils.zip;

import cn.hutool.core.util.ZipUtil;
import com.say.utils.StringUtils;
import com.say.web.exception.ServiceException;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.*;

public class FileParsingUtil {

    private static final Logger logger = LoggerFactory.getLogger(FileParsingUtil.class);

    static final String FILE_URL = "E:\\fupload\\rar"; //解压到的文件夹




    // 删除zip 文件
    public static void delZipFile() {
        File file = new File(FILE_URL);
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                if (f.getName().endsWith(".rar") || f.getName().endsWith(".zip")) { // rar文件 判断 是否存在
                    if (f.delete()) {
                        logger.info("rar文件已经删除");
                    } else {
                        logger.info("rar文件删除失败");
                    }
                }
            }
        }
    }



    //获取路径下所有zip文件 目前只支持zip类型压缩包,其他类型时很多地方不兼容
    public static String getZipFile() {
        String file_url = null;

        File[] files  =  new File(FILE_URL).listFiles();
        for (File file : files) {
            if (/*file.getName().endsWith(".rar") ||*/file.getName().endsWith(".zip")){
                file_url = String.valueOf(file);
            }

        }
        return file_url;
    }

    //将File 转成MultipartFile类型
    public static Map<String,MultipartFile> fileToMultipartFile() {

        //获取压缩包
        String zipFileUrl = getZipFile();

        //文件名称,文件
        Map<String,MultipartFile> map = new HashMap<>();

        //解压文件
        File files = ZipUtil.unzip(zipFileUrl, Charset.forName("GBK"));

        for (File f : Objects.requireNonNull(files.listFiles())) {
            if (f.getName().endsWith(".csv") || f.getName().endsWith(".xls") || f.getName().endsWith(".xlsx")) {

                DiskFileItem fileitem;
                try {

                    fileitem = (DiskFileItem) new DiskFileItemFactory().createItem(
                            "file", MediaType.ALL_VALUE, true, f.getName());
                    InputStream input = Files.newInputStream(f.toPath());
                    OutputStream os = fileitem.getOutputStream();
                    IOUtils.copy(input, os);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                map.put(f.getName().split("\\.")[0], new CommonsMultipartFile(fileitem));
            }
        }

        return map;
    }



}



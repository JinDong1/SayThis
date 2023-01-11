package com.say.excelpion;

import cn.hutool.core.io.resource.Resource;
import cn.hutool.core.util.ZipUtil;
import com.alibaba.excel.EasyExcel;
import com.say.utils.FunctionUtils;
import org.apache.commons.lang3.Validate;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

@SpringBootTest
public class ExcelpionTest {


    @Test
    public void test01() {
        FunctionUtils.isTure(true).throwMessage("暂未绑定销售经理职位");
    }

}

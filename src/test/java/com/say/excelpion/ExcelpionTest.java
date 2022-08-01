package com.say.excelpion;

import com.say.utils.FunctionUtils;
import org.apache.commons.lang3.Validate;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ExcelpionTest {


    @Test
    public void test01() {
        FunctionUtils.isTure(true).throwMessage("暂未绑定销售经理职位");
    }

    @Test
    public void testValidate() {
        Validate.isTrue(true);
        //Assert.isTrue(false,"权限不足");
    }

}

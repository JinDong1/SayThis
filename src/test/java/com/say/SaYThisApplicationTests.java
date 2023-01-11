package com.say;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.say.domain.SysUser;
import com.say.mapper.SysUserMapper;
import com.say.service.SysUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SaYThisApplicationTests {

    @Autowired
    SysUserMapper sysUserMapper;

    @Test
    void contextLoads() {
        Page<SysUser> sysUserPage = sysUserMapper.selectPage(new Page<>(0, 0), null);
        System.out.println(sysUserPage);
    }

}

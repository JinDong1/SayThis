package com.say.controller;


import com.say.commom.core.R;
import com.say.commom.model.PageCondition;
import com.say.domain.SysUser;
import com.say.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;


    @PostMapping("/insert")
    public R insert(@RequestBody SysUser sysUser) {
        return R.success(sysUserService.save(sysUser));
    }

    @PostMapping("/update")
    public R update(@RequestBody SysUser sysUser) {
        return R.success(sysUserService.updateById(sysUser));
    }


    @PostMapping("/list")
    public R getUserList(@RequestBody PageCondition<SysUser> sysUser) {
        return R.success(sysUserService.list(sysUser));
    }


}

package com.say.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.say.commom.model.PageCondition;
import com.say.domain.SysUser;

/**
 * @author admin
 * @description 针对表【sys_user(用户信息表)】的数据库操作Service
 * @createDate 2022-08-26 16:31:16
 */
public interface SysUserService extends IService<SysUser> {


    Page<SysUser> list(PageCondition<SysUser> sysUser);

}


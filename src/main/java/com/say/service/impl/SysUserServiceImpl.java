package com.say.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.say.commom.model.PageCondition;
import com.say.domain.SysUser;
import com.say.mapper.SysUserMapper;
import com.say.service.SysUserService;
import com.say.utils.StringUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


/**
 * @author admin
 * @description 针对表【sys_user(用户信息表)】的数据库操作Service实现
 * @createDate 2022-08-26 16:31:16
 */
@Service
@AllArgsConstructor
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser>
        implements SysUserService {


    private final SysUserMapper sysUserMapper;

    public Page<SysUser> list(PageCondition<SysUser> sysUser) {

        SysUser obj = sysUser.getObj();

        QueryWrapper<SysUser> wrapper = new QueryWrapper<>();
        if (StringUtils.isNotNull(obj)) {
            wrapper.lambda()
                    .eq(StringUtils.isNotEmpty(obj.getUserName()), SysUser::getUserName, obj.getUserName())
                    .eq(StringUtils.isNotEmpty(obj.getSex()), SysUser::getSex, obj.getSex());
        }

        return sysUserMapper.selectPage(new Page<>(sysUser.getCurrent(), sysUser.getSize()), wrapper);

    }

}





package com.say.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.say.domain.SysJob;
import com.say.mapper.SysJobMapper;
import com.say.service.SysJobService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author admin
 * @description 针对表【sys_job(定时任务调度表)】的数据库操作Service实现
 * @createDate 2022-07-04 16:23:26
 */
@Service
@AllArgsConstructor
public class SysJobServiceImpl extends ServiceImpl<SysJobMapper, SysJob>
        implements SysJobService {


}

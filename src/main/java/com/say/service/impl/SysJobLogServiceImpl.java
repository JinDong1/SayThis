package com.say.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.say.commom.model.PageCondition;
import com.say.domain.SysJobLog;
import com.say.mapper.SysJobLogMapper;
import com.say.service.SysJobLogService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author admin
 * @description 针对表【sys_job_log(定时任务调度日志表)】的数据库操作Service实现
 * @createDate 2022-07-04 16:23:26
 */
@Service
@AllArgsConstructor
public class SysJobLogServiceImpl extends ServiceImpl<SysJobLogMapper, SysJobLog> implements SysJobLogService {

    private SysJobLogMapper sysJobLogMapper;

    @Override
    public Page<SysJobLog> list(PageCondition<SysJobLog> pageCondition) {

        SysJobLog sysJobLog = pageCondition.getObj();

        return sysJobLogMapper.selectPage(new Page<>(pageCondition.getCurrent(),
                pageCondition.getSize()), new QueryWrapper<SysJobLog>().lambda().eq(SysJobLog::getJobName, sysJobLog.getJobName()));
    }

    /**
     * 清空任务日志
     */
    @Override
    @Transactional
    public void cleanJobLog() {
        sysJobLogMapper.delete(null);
    }
}

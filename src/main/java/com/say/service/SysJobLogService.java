package com.say.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.say.commom.model.PageCondition;
import com.say.domain.SysJobLog;

/**
 * @author admin
 * @description 针对表【sys_job_log(定时任务调度日志表)】的数据库操作Service
 * @createDate 2022-07-04 16:23:26
 */
public interface SysJobLogService extends IService<SysJobLog> {

    Page<SysJobLog> list(PageCondition<SysJobLog> pageCondition);

    /**
     * 清空任务日志
     */
    public void cleanJobLog();




}

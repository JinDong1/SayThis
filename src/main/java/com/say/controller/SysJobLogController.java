package com.say.controller;

import com.say.commom.core.R;
import com.say.commom.model.PageCondition;
import com.say.domain.SysJobLog;
import com.say.service.SysJobLogService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 调度日志操作处理
 *
 * @author ruoyi
 */
@RestController
@AllArgsConstructor
@RequestMapping("/jobLog")
public class SysJobLogController {

    private SysJobLogService jobLogService;

    /**
     * 查询定时任务调度日志列表
     */
    @GetMapping("/list")
    public R list(@RequestBody PageCondition<SysJobLog> pageCondition) {
        return R.success(jobLogService.list(pageCondition));
    }


    /**
     * 删除定时任务调度日志
     */
    @DeleteMapping("/{jobLogIds}")
    public R remove(@PathVariable List<Long> jobLogIds) {
        return R.success(jobLogService.removeBatchByIds(jobLogIds) ? "操作成功" : "操作失败");
    }

    /**
     * 清空定时任务调度日志
     */
    @DeleteMapping("/clean")
    public R clean() {
        jobLogService.cleanJobLog();
        return R.success();
    }
}

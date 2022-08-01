package com.say.controller;

import com.say.commom.core.R;
import com.say.commom.model.PageCondition;
import com.say.domain.SysJob;
import com.say.service.SysJobService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 调度任务信息操作处理
 *
 * @author ruoyi
 */
@RestController
@AllArgsConstructor
@RequestMapping("/job")
public class SysJobController {


    private SysJobService jobService;
/*

    @GetMapping("/all")
    public List<String> getAllSuperScheduledName() {
        return superScheduledManager.getAllSuperScheduledName();
    }
*/

    /**
     * 查询定时任务列表
     */
    @PostMapping("/list")
    public R list(@RequestBody PageCondition<SysJob> pageCondition) {
        return R.success(jobService.list());
    }

}

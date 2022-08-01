package com.say.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.say.domain.Cron;

/**
 * @author admin
 * @description 针对表【cron】的数据库操作Service
 * @createDate 2022-07-08 13:24:49
 */
public interface CronService extends IService<Cron> {

    void startCron(Cron cron);

    void stopCron(Cron cron);

    void changeCron(Cron cron);
}

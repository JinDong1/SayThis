package com.say.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TesstTask {

    @Scheduled(cron = "0/30 * * * * ?")
    public void robReceiveExpireTask() {
        System.out.println("30s-执行`````````");
    }
}

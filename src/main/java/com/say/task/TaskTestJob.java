//package com.jd.demo.task;
//
//import org.springframework.scheduling.annotation.Async;
//import org.springframework.scheduling.annotation.EnableAsync;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//import java.util.Date;
//
//@Component
//@EnableAsync
//@Async
//public class TaskTestJob {
//
//
//    /** 周期执行，每秒执行一次 */
//    @Scheduled(cron = "0 */5 * * * ?")
//    public void task1() throws InterruptedException{
//        System.out.println("task1------time:" + new Date() + " " +Thread.currentThread().getName());
//
//        int i = 5 / 0;
//        Thread.sleep(1000 * 2);
//    }
//
//    /**
//     * 五分钟走一次
//     * @throws InterruptedException
//     */
//    @Scheduled(cron = "0 */5 * * * ?")
//    public void task2() throws InterruptedException{
//        System.out.println("task2------time:" + new Date() + " " +Thread.currentThread().getName());
//        Thread.sleep(1000 * 2);
//        System.out.println("还需三分钟");
//    }
//
//}
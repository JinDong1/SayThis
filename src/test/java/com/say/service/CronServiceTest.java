package com.say.service;

import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;


@SpringBootTest
class CronServiceTest {


    public static void main(String[] args) {
        LocalDateTime lastDay = LocalDateTime.now().with(TemporalAdjusters.lastDayOfYear()).withHour(23).withMinute(59).withSecond(59);
        System.out.println(lastDay);
    }
}
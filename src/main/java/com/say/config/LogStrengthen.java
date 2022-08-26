package com.say.config;


import com.ojd.tsl.common.annotation.SuperScheduledInteriorOrder;
import com.ojd.tsl.common.utils.proxy.Point;
import com.ojd.tsl.core.RunnableInterceptor.strengthen.BaseStrengthen;
import com.ojd.tsl.model.ScheduledRunningContext;
import com.say.domain.ScheduledLog;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Date;

@SuperScheduledInteriorOrder(-1)
@Component("logStrengthen2")
public class LogStrengthen implements BaseStrengthen {
    private ScheduledLog scheduledLog;

    private String logPath;

    public LogStrengthen() {
    }

    public LogStrengthen(String logPath) {
        this.logPath = logPath;
    }

    /**
     * 前置强化方法
     *
     * @param bean    bean实例（或者是被代理的bean）
     * @param method  执行的方法对象
     * @param args    方法参数
     * @param context 任务线程运行时的上下文
     */
    @Override
    public void before(Object bean, Method method, Object[] args, ScheduledRunningContext context) {
        Point point = (Point) bean;
        scheduledLog = new ScheduledLog();
//        scheduledLog.setScheduledSource(point.getScheduledSource());
        scheduledLog.setStatrDate(new Date());
        scheduledLog.setScheduledName(point.getSuperScheduledName());
    }

    /**
     * 后置强化方法
     *
     * @param bean    bean实例（或者是被代理的bean）
     * @param method  执行的方法对象
     * @param args    方法参数
     * @param context 任务线程运行时的上下文
     */
    @Override
    public void after(Object bean, Method method, Object[] args, ScheduledRunningContext context) {
        scheduledLog.setEndDate(new Date());
        scheduledLog.setIsSuccess(Boolean.TRUE);
        scheduledLog.computingTime();
//        SerializableUtils.toIncFile(scheduledLog, logPath, scheduledLog.getFileName());
    }

    /**
     * 异常强化方法
     *
     * @param bean    bean实例（或者是被代理的bean）
     * @param method  执行的方法对象
     * @param args    方法参数
     * @param context 任务线程运行时的上下文
     */
    @Override
    public void exception(Object bean, Method method, Object[] args, ScheduledRunningContext context, Exception e) {
        scheduledLog.setException(e.getMessage());
        scheduledLog.setIsSuccess(Boolean.FALSE);
    }

    /**
     * Finally强化方法，出现异常也会执行
     *
     * @param bean    bean实例（或者是被代理的bean）
     * @param method  执行的方法对象
     * @param args    方法参数
     * @param context 任务线程运行时的上下文
     */
    @Override
    public void afterFinally(Object bean, Method method, Object[] args, ScheduledRunningContext context) {
        scheduledLog.setEndDate(new Date());
        scheduledLog.computingTime();
        if (scheduledLog.getIsSuccess() != null && !scheduledLog.getIsSuccess()) {

            System.out.println("异常信息==== scheduledLog:" + scheduledLog);
//            SerializableUtils.toIncFile(scheduledLog, logPath, scheduledLog.getFileName());
        }
    }
}

//package com.jd.demo.commom.aspectj;
//
//import com.gyx.superscheduled.common.annotation.SuperScheduledInteriorOrder;
//import com.gyx.superscheduled.common.utils.SerializableUtils;
//import com.gyx.superscheduled.common.utils.proxy.Point;
//import com.gyx.superscheduled.core.RunnableInterceptor.strengthen.BaseStrengthen;
//import com.gyx.superscheduled.model.ScheduledLog;
//import com.gyx.superscheduled.model.ScheduledRunningContext;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//import java.lang.reflect.Method;
//import java.util.Date;
//
//
///**
// * 定时任务日志处理
// */
//@Component
//@SuperScheduledInteriorOrder(1)
//public class TaskLogStrengthen implements BaseStrengthen {
//
//    private ScheduledLog scheduledLog;
//
//    @Value("${spring.super.scheduled.plug-in.logPath}")
//    private String logPath;
//
//    /**
//     * 前置强化方法
//     *
//     * @param bean    bean实例（或者是被代理的bean）
//     * @param method  执行的方法对象
//     * @param args    方法参数
//     * @param context 任务线程运行时的上下文
//     */
//    @Override
//    public void before(Object bean, Method method, Object[] args, ScheduledRunningContext context) {
//        System.out.println("1");
//        Point point = (Point) bean;
//        scheduledLog = new ScheduledLog();
//        scheduledLog.setScheduledSource(point.getScheduledSource());
//        scheduledLog.setStatrDate(new Date());
//        scheduledLog.setSuperScheduledName(point.getSuperScheduledName());
//    }
//
//    /**
//     * 后置强化方法
//     *
//     * @param bean    bean实例（或者是被代理的bean）
//     * @param method  执行的方法对象
//     * @param args    方法参数
//     * @param context 任务线程运行时的上下文
//     */
//    @Override
//    public void after(Object bean, Method method, Object[] args, ScheduledRunningContext context) {
//        System.out.println("2");
//
//        scheduledLog.setEndDate(new Date());
//        scheduledLog.setSuccess(Boolean.TRUE);
//        scheduledLog.computingTime();
//        SerializableUtils.toIncFile(scheduledLog, logPath, scheduledLog.getFileName());
//    }
//
//    /**
//     * 异常强化方法
//     *
//     * @param bean    bean实例（或者是被代理的bean）
//     * @param method  执行的方法对象
//     * @param args    方法参数
//     * @param context 任务线程运行时的上下文
//     */
//    @Override
//    public void exception(Object bean, Method method, Object[] args, ScheduledRunningContext context) {
//        scheduledLog.setSuccess(Boolean.FALSE);
//    }
//
//    /**
//     * Finally强化方法，出现异常也会执行
//     *
//     * @param bean    bean实例（或者是被代理的bean）
//     * @param method  执行的方法对象
//     * @param args    方法参数
//     * @param context 任务线程运行时的上下文
//     */
//    @Override
//    public void afterFinally(Object bean, Method method, Object[] args, ScheduledRunningContext context) {
//        System.out.println("3");
//        scheduledLog.setEndDate(new Date());
//        scheduledLog.computingTime();
//        scheduledLog.generateFileName();
//        if (scheduledLog.getSuccess() != null && !scheduledLog.getSuccess()) {
//            SerializableUtils.toIncFile(scheduledLog, logPath, scheduledLog.getFileName());
//        }
//        System.out.println("scheduledLog:"+scheduledLog.toString());
//    }
//
//    public TaskLogStrengthen() {
//
//    }
//
//    public TaskLogStrengthen(String logPath) {
//        this.logPath = logPath;
//    }
//}

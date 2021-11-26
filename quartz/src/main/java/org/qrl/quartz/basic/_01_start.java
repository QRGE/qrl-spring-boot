package org.qrl.quartz.basic;

import org.qrl.quartz.basic.job.HelloJob;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.concurrent.TimeUnit;

/**
 * @Author: QR
 * @Date: 2021/9/6-14:27
 */
public class _01_start {
    public static void main(String[] args) {
        try {
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            // 启动 scheduler 会启动一个 10 个线程容量的线程池
            scheduler.start();
            JobDetail job = JobBuilder.newJob(HelloJob.class).withIdentity("job1", "group1").build();
            Trigger trigger1 = TriggerBuilder
                    .newTrigger()
                    .withIdentity("trigger1", "group1")
                    .startNow()
                    .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(5).repeatForever())
                    .build();
            Trigger trigger2 = TriggerBuilder
                    .newTrigger()
                    .withIdentity("trigger2", "group1")
                    // trigger 可以通过 forJob() 指定任务, 如果利用 forJob() 设置任务, 设置的任务需要在 scheduler 中先注册, 否则会报 JobPersistenceException 异常
                    .forJob("job1", "group1")
                    .startNow()
                    .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(2).repeatForever())
                    .build();
            scheduler.scheduleJob(job, trigger1);
            // 也可以在 schedule 中指定任务
            scheduler.scheduleJob(trigger2);
            TimeUnit.SECONDS.sleep(30);
            scheduler.shutdown();
        } catch (SchedulerException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}


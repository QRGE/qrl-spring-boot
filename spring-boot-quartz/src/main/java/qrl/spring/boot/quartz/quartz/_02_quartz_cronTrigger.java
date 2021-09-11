package qrl.spring.boot.quartz.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import qrl.spring.boot.quartz.quartz.job.HelloJob;

import java.util.concurrent.TimeUnit;

/**
 * @Author: QR
 * @Date: 2021/9/6-16:00
 */
public class _02_quartz_cronTrigger {

    public static void main(String[] args) {
        try {
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            scheduler.start();
            // job
            JobDetail job = JobBuilder.newJob(HelloJob.class).withIdentity("jobA", "groupA").build();
            // trigger
            Trigger trigger = TriggerBuilder.newTrigger()
                    .withIdentity("triggerA", "groupA")
                    .startNow()
                    .withSchedule(CronScheduleBuilder.cronSchedule("0/5 * * * * ?"))
                    .build();
            scheduler.scheduleJob(job, trigger);

            // 睡眠 main 线程, quartz的线程池不受影响
            TimeUnit.SECONDS.sleep(30);
            scheduler.shutdown();
        } catch (SchedulerException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

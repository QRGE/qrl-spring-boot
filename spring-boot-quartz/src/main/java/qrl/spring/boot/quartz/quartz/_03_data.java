package qrl.spring.boot.quartz.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import qrl.spring.boot.quartz.quartz.job.HelloDataJob;

import java.util.concurrent.TimeUnit;

/**
 * trigger 和 jobDetail 都可以用过 jobDataMap 传递参数给 job
 * @Author: QR
 * @Date: 2021/9/11-15:44
 */
public class _03_data {
    public static void main(String[] args) {
        try {
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            scheduler.start();
            // job
            JobDetail job = JobBuilder.newJob(HelloDataJob.class)
                    .withIdentity("jobA", "groupA")
                    .usingJobData("jobA-key-1", "jobA-value-1")
                    .build();
            // trigger
            Trigger trigger = TriggerBuilder.newTrigger()
                    .withIdentity("triggerA", "groupA")
                    .startNow()
                    .usingJobData("triggerA-key-1", "triggerA-value-1")
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

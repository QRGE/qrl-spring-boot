package qrl.spring.boot.quartz.quartz.job;

import org.quartz.*;

import java.util.StringJoiner;

/**
 * @Author: QR
 * @Date: 2021/9/11-15:44
 */
public class HelloDataJob implements Job {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        JobDetail jobDetail = context.getJobDetail();
        Trigger trigger = context.getTrigger();
        StringJoiner out = new StringJoiner(",")
                .add("HelloDataJob.execute")
                .add("HelloDataJob")
                .add(Thread.currentThread().getName())
                .add(context.getTrigger().getKey().getName());
        System.out.println(out);
        System.out.println(jobDetail.getJobDataMap().get("jobA-key-1"));
        System.out.println(trigger.getJobDataMap().get("triggerA-key-1"));
    }
}

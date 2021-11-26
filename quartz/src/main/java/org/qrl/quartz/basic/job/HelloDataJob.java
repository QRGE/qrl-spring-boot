package org.qrl.quartz.basic.job;

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
        // 合并的 jobDataMap 中在 job 的 DataMap 和 trigger 的 DataMap 中如果存在相同的key, trigger 的值优先级更高
        // 即同 key 的情况下总会取 trigger 的 value
        JobDataMap dataMap = context.getMergedJobDataMap();
        System.out.println(dataMap.get("key"));
    }
}

package org.qrl.quartz.basic.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.StringJoiner;

/**
 * Job 的实现类必须有一个无参构造函数
 * @Author: QR
 * @Date: 2021/9/6-16:03
 */
public class HelloJob implements Job {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        StringJoiner out = new StringJoiner("-")
                .add("你好哇")
                .add(Thread.currentThread().getName())
                .add(context.getTrigger().getKey().getName());
        System.out.println(out);
    }
}

package org.venom.scheduler.quartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;

import java.util.Date;

public class TestJob implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) {
        System.out.println("** Testing Scheduler ** . Fired at: " + new Date());
    }
}

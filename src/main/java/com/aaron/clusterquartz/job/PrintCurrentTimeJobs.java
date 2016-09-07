package com.aaron.clusterquartz.job;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;

/**
 * @author FengHaixin
 * @description 一句话描述该文件的用途
 * @date 2016-05-23
 */
public class PrintCurrentTimeJobs extends QuartzJobBean
{
    private static final Log LOG_RECORD = LogFactory.getLog(PrintCurrentTimeJobs.class);

    @Autowired
    private ClusterQuartz clusterQuartz;


    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException
    {
        LOG_RECORD.info("begin to execute task," + DateUtils.dateToString(new Date()));

        clusterQuartz.printUserInfo();

        LOG_RECORD.info("end to execute task," + DateUtils.dateToString(new Date()));

    }
}

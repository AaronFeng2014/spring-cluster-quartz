package com.aaron.clusterquartz.cron;

import java.text.ParseException;

import org.quartz.JobDetail;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;

/**
 * @author FengHaixin
 * @description 一句话描述该文件的用途
 * @date 2016-05-27
 */
public class PersistableCronTriggerFactoryBean extends CronTriggerFactoryBean
{

    @Override
    public void afterPropertiesSet() throws ParseException
    {
        super.afterPropertiesSet();
        getJobDataMap().remove(getObject().getJobKey().getName());
    }
}



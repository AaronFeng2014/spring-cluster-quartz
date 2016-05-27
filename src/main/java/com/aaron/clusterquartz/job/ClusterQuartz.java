package com.aaron.clusterquartz.job;

import com.arron.util.DateUtils;
import org.springframework.stereotype.Controller;

import java.util.Date;

/**
 * @author FengHaixin
 * @description 一句话描述该文件的用途
 * @date 2016-05-23
 */
@Controller
public class ClusterQuartz
{
    public void printCurrentTime()
    {
        System.out.println("current time is " + DateUtils.dateToString(new Date(),"yyyy-MM-dd HH:mm:ss:SSS"));
    }
}

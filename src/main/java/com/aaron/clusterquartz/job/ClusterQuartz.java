package com.aaron.clusterquartz.job;

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
    public void printUserInfo()
    {
        System.out.println("***      start " + DateUtils.dateToString(new Date(), "yyyy-MM-dd HH:mm:ss:SSS") + "    *************");

        System.out.println("*");
        System.out.println("*        current username is " + System.getProperty("user.name"));
        System.out.println("*        current os name is " + System.getProperty("os.name"));
        System.out.println("*");

        System.out.println("*********current user information end******************");
    }
}

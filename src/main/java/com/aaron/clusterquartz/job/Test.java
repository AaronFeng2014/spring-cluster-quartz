package com.aaron.clusterquartz.job;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author FengHaixin
 * @description 一句话描述该文件的用途
 * @date 2016-05-23
 */
public class Test
{
    public static void main(String[] args)
    {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        ClusterQuartz clusterQuartz = (ClusterQuartz)context.getBean("clusterQuartz");
        clusterQuartz.printUserInfo();

        while (true)
        {

        }
    }
}

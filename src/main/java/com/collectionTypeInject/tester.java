package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class tester {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collectionConfig.xml");
        employ myEmploy = (employ) context.getBean("employ1");
        System.out.println(myEmploy.getAddress());
        System.out.println(myEmploy);
    }
}

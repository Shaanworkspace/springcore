package com.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testClass {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("src\\main\\resources\\constructorInjectConfig.xml");
        Person p=(Person) context.getBean("person");
        System.out.println(p);
    }  

}

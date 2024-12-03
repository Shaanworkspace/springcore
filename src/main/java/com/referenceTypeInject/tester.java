package com.referenceTypeInject;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class tester {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("refTypeInjectConfig.xml");
        A myEmploy = (A) context.getBean("ARef");
        System.out.println(myEmploy.getX());
        System.out.println(myEmploy.getObjectB());
        System.out.println(myEmploy.getObjectB().getY());
        System.out.println(myEmploy);
        //System.out.println(myEmploy.toString()); -> will have same value
    }
}

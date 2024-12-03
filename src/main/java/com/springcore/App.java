package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Students student1 = (Students) context.getBean( "student1");
        //this is printed by toString Method in Student class
        System.out.println(student1); //if no toString() method it will generate a hashcode
        Students student2 = (Students) context.getBean("student2");
        System.out.println(student2);
    }
}

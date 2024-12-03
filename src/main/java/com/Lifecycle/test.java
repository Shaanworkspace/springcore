package com.Lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    //calling method by xml file
    public static void main(String[] args) {
    @SuppressWarnings("resource")
    ApplicationContext context = new ClassPathXmlApplicationContext("src\\main\\java\\com\\Lifecycle\\samosaConfigure.xml");
    
    //get bean will get name of bean which is in xml file
    Samosa s = (Samosa) context.getBean("samosa");
    System.out.println(s);
    }
}

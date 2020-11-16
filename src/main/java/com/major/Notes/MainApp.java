package com.major.Notes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
/*        ApplicationContext context = new ClassPathXmlApplicationContext("BeansNotes.xml");
        Profile profile = (Profile) context.getBean("profile");
        profile.printAge();
        profile.printName();*/


        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("BeansNotes.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        context.registerShutdownHook();
    }
}

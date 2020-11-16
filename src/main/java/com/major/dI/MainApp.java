package com.major.dI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeansDI.xml");
        TextEditor textEditor = (TextEditor)applicationContext.getBean("textEditor");
        textEditor.spellCheck();

        System.out.println("------------------------------------------------------------------");

        JavaCollection javaCollection = (JavaCollection)applicationContext.getBean("javaCollection");
        javaCollection.getAddressList();
        javaCollection.getAddressMap();
        javaCollection.getAddressProp();
        javaCollection.getAddressSet();
    }
}

package com.major.assembling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
/*        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeansAssembling.xml");
        TextEditor textEditor = (TextEditor)applicationContext.getBean("textEditor");
        textEditor.spellCheck();*/

System.out.println("------------------------------------------------------------------------");

        ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("BeansAssembling.xml");
        TextEditor2 textEditor2 = (TextEditor2)applicationContext2.getBean("textEditor2");
        textEditor2.spellCheck();
    }
}

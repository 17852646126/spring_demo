package com.major.Based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
/*        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(TextEditorConfig.class);

        TextEditor te = ctx.getBean(TextEditor.class);

        te.spellCheck();*/


        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("BeansBased.xml");

        // Let us raise a start event.
        context.start();

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

        obj.getMessage();

        // Let us raise a stop event.
        context.stop();
    }


    /*public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(HelloWorldConfig.class);

        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

        helloWorld.setMessage("Hello World!");
        helloWorld.getMessage();
    }*/
}

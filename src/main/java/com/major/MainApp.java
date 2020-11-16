package com.major;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        //Bean的生命周期+后置处理器
        AbstractApplicationContext abstractApplicationContext =
                new ClassPathXmlApplicationContext("Beans.xml");//生命周期的init-method调用；
                                                                            // 创建容器时或实例bean时，后置处理器在每个创建的bean前后做处理
        HelloWorld helloWorld = (HelloWorld)abstractApplicationContext.getBean("helloWorld123456");
        helloWorld.setMessage("111111");
        helloWorld.getMessage();
        abstractApplicationContext.registerShutdownHook();

        System.out.println("------------------------------------------------------------------");

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld helloWorld1 = (HelloWorld)applicationContext.getBean("helloWorld123456");
        helloWorld1.getMessage();
        helloWorld1.getMessage1();

        Hello hello = (Hello)applicationContext.getBean("hello123456");
        hello.getMessage();
        hello.getMessage1();
        hello.getMessage2();
        hello.getMessage3();

        System.out.println("------------------------------------------------------------------");





        /*生命周期的destroy-method被调用*/
    }
}

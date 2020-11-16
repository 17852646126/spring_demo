package com.major;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Test {
    public static void main(String[] args) {
        /*BeanFactory 容器*/
        XmlBeanFactory factory =
                new XmlBeanFactory(new ClassPathResource("Beans.xml"));
        HelloWorld obj = (HelloWorld)factory.getBean("helloWorld");
        obj.getMessage();

        /*ApplicationContext容器中FileSystemXmlApplicationContext接口*/
        ApplicationContext applicationContext1 =
                new FileSystemXmlApplicationContext("E:/ZDxm/spring_demo/src/main/resources/Beans.xml");//完整路径
        HelloWorld helloWorld1 = (HelloWorld) applicationContext1.getBean("helloWorld");
        helloWorld1.setMessage("ApplicationContext容器中FileSystemXmlApplicationContext接口");
        helloWorld1.getMessage();

        /*ApplicationContext容器中WebXmlApplicationContext接口*/
        /*ApplicationContext applicationContext2 =
                new WebXmlApplicationContext("E:/ZDxm/spring_demo/src/main/resources/Beans.xml");//完整路径
        HelloWorld helloWorld2 = (HelloWorld) applicationContext2.getBean("helloWorld");
        helloWorld.setMessage("ApplicationContext容器中WebXmlApplicationContext接口");
        helloWorld2.getMessage();*/

        /*ApplicationContext容器中ClassPathXmlApplicationContext接口*/
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("Beans.xml");//创建并初始化一个容器
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");
        helloWorld.setMessage("111111");
        helloWorld.getMessage();

        HelloWorld helloWorld2 = (HelloWorld) applicationContext.getBean("helloWorld");
        helloWorld2.getMessage();



    }
}

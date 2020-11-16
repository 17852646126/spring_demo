package com.major;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitHelloWorld implements BeanPostProcessor {
    //调用初始化方法前后对 Bean 进行额外的处理
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("后置处理器之前Bean中的id："+s);
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("后置处理器之后Bean中的id："+s);
        return o;
    }
}

package com.rg.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @BelongsProject: spring_quickstart
 * @Author: RG
 * @CreateTime: 2022/10/12 7:55 下午
 * @Description:
 */
public class Person implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    private String name;

    public Person() {
        System.out.println("Person类构造方法");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("set方法被调用");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    // 自定义的初始化函数
    public void myInit() {
        System.out.println("myInit被调用");
    }

    // 自定义的销毁方法
    public void myDestroy() {
        System.out.println("myDestroy被调用");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName被调用，beanName:" + s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory被调用，beanFactory");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext被调用");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet被调用");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy被调用");
    }

}

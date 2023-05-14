package com.cao.spring.bean;

import com.cao.spring.config.MainConfiguration;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


public class CarTest {
    @Test
    public void test01(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);
        Car carBean = context.getBean("carBean", Car.class);
        System.out.println(carBean);
    }
}

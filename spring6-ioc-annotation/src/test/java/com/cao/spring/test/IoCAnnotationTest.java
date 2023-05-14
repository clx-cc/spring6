package com.cao.spring.test;

import com.cao.spring.bean.*;
import com.cao.spring.bean3.MyDataSource;
import com.cao.spring.dao.OrderDao;
import com.cao.spring.service.OrderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCAnnotationTest {
    @Test
    public void testNoXml(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Object orderBean = applicationContext.getBean("orderBean",Order.class);
        System.out.println(orderBean);
    }
    @Test
    public void testAutoWired(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-di-annotation.xml");
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.insert();
    }
    @Test
    public void testDIByAnnotation(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-di-annotation.xml");
        MyDataSource myDataSource = applicationContext.getBean("myDataSource", MyDataSource.class);
        System.out.println(myDataSource);

    }
    @Test
    public void testChoose(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-choose.xml");

    }
    @Test
    public void testBeanComponent(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User userBean = applicationContext.getBean("userBean", User.class);
        Vip vipBean = applicationContext.getBean("vipBean", Vip.class);
        Order orderBean = applicationContext.getBean("orderBean", Order.class);
        Student studentBean = applicationContext.getBean("studentBean", Student.class);
        System.out.println(userBean);
        System.out.println(vipBean);
        System.out.println(orderBean);
        System.out.println(studentBean);
        OrderDao orderDao = applicationContext.getBean("orderDao", OrderDao.class);
        System.out.println(orderDao);
    }
}

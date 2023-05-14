package com.cao.spring6.test;

import com.cao.spring6.bean.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanInstantiationTest {

    @Test
    public void testDate(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Student studentBean = applicationContext.getBean("studentBean", Student.class);
        System.out.println(studentBean);
    }
    @Test
    public void testBeanInstantiation4(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Customer customer = applicationContext.getBean("customer", Customer.class);
        System.out.println(customer);

    }
    @Test
    public void testBeanInstantiation3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Order order = applicationContext.getBean("order", Order.class);
        System.out.println(order);

    }
    @Test
    public void testBeanInstantiation2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Star star = applicationContext.getBean("star", Star.class);
        System.out.println(star);

    }
    @Test
    public void testBeanInstantiation1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        SpringBean springBean = applicationContext.getBean("springBean", SpringBean.class);

        Person personBean = applicationContext.getBean("personBean", Person.class);
        System.out.println(personBean);
    }
}

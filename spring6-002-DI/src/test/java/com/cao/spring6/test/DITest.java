package com.cao.spring6.test;

import com.cao.spring6.bean.*;
import com.cao.spring6.dao.User;
import com.cao.spring6.dao.UserDao;
import com.cao.spring6.service.CustomerService;
import com.cao.spring6.service.OrderService;
import com.cao.spring6.service.UserService;
import org.apache.logging.log4j.core.config.AppendersPlugin;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Locale;

public class DITest {

    @Test
    public void testCats(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        Animal animal = applicationContext.getBean("animal", Animal.class);
        System.out.println(animal);
    }
    @Test
    public void testProperties(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-properties.xml");
        MyDataSource myDataSourceBean = applicationContext.getBean("myDataSourceBean", MyDataSource.class);
        System.out.println(myDataSourceBean);
    }
    @Test
    public void testAutoWireDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-autowire.xml");
        UserService userServiceBean = applicationContext.getBean("userServiceBean", UserService.class);
        userServiceBean.save();

    }
    @Test
    public void testSpringNamespaceDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-namespace.xml");
        //传统set注入
        Dog dogBean = applicationContext.getBean("dogBean", Dog.class);
        System.out.println(dogBean);
        //p命名空间：简化set注入的
        Dog dogBean2 = applicationContext.getBean("dogBean2", Dog.class);
        System.out.println(dogBean2);
        //传统构造注入
        Dog dogBean3 = applicationContext.getBean("dogBean3", Dog.class);
        System.out.println(dogBean3);
        //c命名空间：简化构造注入的
        Dog dogBean4 = applicationContext.getBean("dogBean4", Dog.class);
        System.out.println(dogBean4);
        //util命名空间
        MyDataSource1 dsu1 = applicationContext.getBean("dsu1", MyDataSource1.class);
        System.out.println(dsu1);
        MyDataSource2 dsu2 = applicationContext.getBean("dsu2", MyDataSource2.class);
        System.out.println(dsu2);
    }
    @Test
    public void testOtherSetDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        //简单类型数组注入：用value
        Person personBean = applicationContext.getBean("personBean", Person.class);
        System.out.println(personBean);
        //复杂类型数组注入：用ref
        Order orderBean = applicationContext.getBean("orderBean", Order.class);
        System.out.println(orderBean);
        //list集合、set集合、map集合、properties注入
        People peopleBean = applicationContext.getBean("peopleBean", People.class);
        System.out.println(peopleBean);
        //注入null和空字符串
        Cat catBean = applicationContext.getBean("catBean", Cat.class);
        System.out.println(catBean);
    }
    @Test
    public void testSimpleTypeSetDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        User userBean = applicationContext.getBean("userBean", User.class);
        System.out.println(userBean);
    }
    @Test
    public void testSetDI2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        OrderService orderServiceBean = applicationContext.getBean("orderServiceBean", OrderService.class);
        orderServiceBean.generate();
    }
    @Test
    public void testConstructorDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        CustomerService csBean1 = applicationContext.getBean("csBean1", CustomerService.class);
        csBean1.save();
        CustomerService csBean2 = applicationContext.getBean("csBean2", CustomerService.class);
        csBean2.save();
    }
    @Test
    public void testSetDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserDao userDaoBean = applicationContext.getBean("userDaoBean", UserDao.class);
        System.out.println(userDaoBean);
        UserService userService = applicationContext.getBean("userServiceBean", UserService.class);
        userService.save();
        System.out.println(new Date());
    }
}

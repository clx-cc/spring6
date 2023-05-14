package com.cao.spring6.test;

import com.cao.spring6.service.LogAspect;
import com.cao.spring6.service.OrderService;
import com.cao.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAopTest {
    @Test
    public void testBefore(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = context.getBean("userService", UserService.class);
        OrderService orderService = context.getBean("orderService", OrderService.class);
//        userService.login();
//        userService.logout();
        orderService.generate();

    }
}

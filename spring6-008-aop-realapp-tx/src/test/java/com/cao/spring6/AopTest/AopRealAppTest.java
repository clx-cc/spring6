package com.cao.spring6.AopTest;

import com.cao.spring6.biz.UserService;
import com.cao.spring6.service.AccountService;
import com.cao.spring6.service.OrderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopRealAppTest {
    @Test
    public void testSecurityLog(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.saveUser();
        userService.deleteUser();
        userService.modifyUser();
        userService.getUser();
    }

    @Test
    public void testTransaction(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        OrderService orderService = context.getBean("orderService", OrderService.class);
        AccountService accountService = context.getBean("accountService", AccountService.class);
        orderService.generate();
        accountService.transfer();
    }
}

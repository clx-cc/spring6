package com.cao.spring6.test;

import com.cao.spring6.biz.UserService;
import com.cao.spring6.service.AccountService;
import com.cao.spring6.service.OrderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring6AopPracticeTest {
    @Test
    public void testSecurity(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.safeUser();
        userService.deleteUser();
        userService.modifyUser();
        userService.getUser();
    }
    @Test
    public void testTransaction(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        accountService.transfer();
        accountService.withdraw();
        orderService.generate();
        orderService.cancle();
    }
}

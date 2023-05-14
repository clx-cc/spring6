package com.cao.bank.test;

import com.cao.bank.pojo.Account;
import com.cao.bank.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SMTest {
    @Test
    public void testSM(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountServiceImpl = applicationContext.getBean("accountServiceImpl", AccountService.class);
        try {
            accountServiceImpl.transfer("act001","act002",10000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

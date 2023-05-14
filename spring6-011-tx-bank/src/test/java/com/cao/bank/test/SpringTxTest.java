package com.cao.bank.test;

import com.cao.bank.pojo.Account;
import com.cao.bank.service.AccountService;
import com.cao.bank.service.impl.AccountServiceImpl;
import com.cao.bank.service.impl.IsolationService01;
import com.cao.bank.service.impl.IsolationService02;
import com.cao.bank.service.impl.TimeoutService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTxTest {
    @Test
    public void testTimeout(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        TimeoutService ts = applicationContext.getBean("ts", TimeoutService.class);
        ts.save(new Account(null,"act-006",9000.0));
    }
    @Test
    public void testIsolation01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        IsolationService01 is01 = applicationContext.getBean("is01", IsolationService01.class);
        is01.getByActno("act-005");
    }
    @Test
    public void testIsolation02(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        IsolationService02 is02 = applicationContext.getBean("is02", IsolationService02.class);
        is02.save(new Account(null,"act-005",1000.0));
    }
    @Test
    public void testPropagation(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountServiceImpl = applicationContext.getBean("accountServiceImpl", AccountService.class);
        accountServiceImpl.save(new Account(null,"act003",2000.0));
    }
    @Test
    public void testSpringTx(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountServiceImpl = applicationContext.getBean("accountServiceImpl", AccountService.class);
        try {
            accountServiceImpl.transfer("act001","act002",10000);
            System.out.println("转账成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.cao.spring6.test;

import com.cao.spring6.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleTest {
        @Test
        public void testLifecycle(){
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
            User userBean = applicationContext.getBean("userBean", User.class);
            System.out.println("使用Bean");
            //只有正常关闭Spring容器才会执行destroy方法
            ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext)applicationContext;
            context.close();
        }
}

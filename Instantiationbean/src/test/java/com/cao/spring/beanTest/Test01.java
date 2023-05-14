package com.cao.spring.beanTest;

import com.cao.spring.bean.构造方法实例Bean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
        构造方法实例Bean 构造方法实例化bean = context.getBean("构造方法实例化bean", 构造方法实例Bean.class);
        System.out.println(构造方法实例化bean);
    }
}

package com.cao.spring.beanTest;

import com.cao.spring.bean.Animal;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {
    @Test
    public void test02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
        Animal catBean = context.getBean("catBean", Animal.class);
        catBean.eat();
    }
}

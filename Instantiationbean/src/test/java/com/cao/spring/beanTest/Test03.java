package com.cao.spring.beanTest;

import com.cao.spring.bean.Animal;
import com.cao.spring.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring3.xml");
        Person personBean = context.getBean("personBean", Person.class);
        personBean.speak();
    }
}

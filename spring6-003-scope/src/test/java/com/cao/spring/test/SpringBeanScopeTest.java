package com.cao.spring.test;

import com.cao.spring.bean.SpringBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanScopeTest {
    @Test
    public void testBeanScope(){
        /**
         * 1.Spring默认情况下是如何管理Bean的：
         *      默认情况下Bean是单例的（singleton)
         *      在Spring上下文初始化时实例化，放到容器内。
         *      每一次调用getBean()方法只是从容器中返回这个单例的对象
         *
         * 2.当bean的scope属性值设置为prototype
         *      Bean是多例的
         *      Spring上下文初始化时就不会再实例化这些bean
         *      每一次调用getBean()方法时，才会实例化该bean
         */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-scope.xml");
        SpringBean sb1 = applicationContext.getBean("sb", SpringBean.class);
        System.out.println(sb1);
        SpringBean sb2 = applicationContext.getBean("sb", SpringBean.class);
        System.out.println(sb2);
        SpringBean sb3 = applicationContext.getBean("sb", SpringBean.class);
        System.out.println(sb3);



    }
}

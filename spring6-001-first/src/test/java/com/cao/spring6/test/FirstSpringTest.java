package com.cao.spring6.test;

import com.cao.spring6.bean.Hu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstSpringTest {

    @Test
    public void testBeginInitBean(){
        //注意：不是在调用getBean()方法的时候创建对象的，而是在执行以下代码的时候，就会实例化对象。
        new ClassPathXmlApplicationContext("spring.xml");
    }
    @Test
    public void testFirstSpringCode(){
        //第一步：获取spring容器对象

        /**
         * ApplicationContext:  应用上下文，其实就是spring容器
         * ApplicationContext：是一个接口
         * ApplicationContext：接口下有很多类，其中有一个实现类：ClassPathXmlApplicationContext
         * ClassPathXmlApplicationContext：这个类专门从类路径下加载spring配置文件的一个spring上下文对象。
         */
        //这行代码只要一执行，就相当于启动了spring容器，解析spring配置文件，并且实例化所有的bean对象，放到spring容器中。
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml","spring.xml");
        //第二步：根据bean的id从spring容器中获取这个对象
        Object userBean = applicationContext.getBean("userBean");
        System.out.println(userBean);

        Object nowTime = applicationContext.getBean("nowTime");
        System.out.println(nowTime);

        Hu huBean = applicationContext.getBean("huBean", Hu.class);
        System.out.println(huBean);
    }
}

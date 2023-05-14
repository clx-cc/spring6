package com.cao.proxy.client;

import com.cao.proxy.invocationhandler.MyInvocationHandler;
import com.cao.proxy.service.OrderService;
import com.cao.proxy.service.impl.OrderServiceImpl;

import java.lang.reflect.Proxy;

public class JDKProxyClient {
    public static void main(String[] args) {
        //创建目标对象
        OrderService orderService = new OrderServiceImpl();
        //创建代理对象
        OrderService proxy = (OrderService) Proxy.newProxyInstance(orderService.getClass().getClassLoader(),
                orderService.getClass().getInterfaces(),new MyInvocationHandler(orderService)
                );
        /**
         * 以上创建代理对象这段代码，主要实现了两点：一是生成了代理类的.class文件，二是创建了代理对象
         * JDK动态代理创建代理对象需要三个参数：
         *      一是：类加载器：
         *      二是：代理类和目标类共同实现的接口，公共接口
         *      三是：调用处理器接口
         *          我们需要实现这个接口，重写其中的方法并且写增强代码。
         */
        //代理对象调用代理方法
        String name = proxy.getName();
        System.out.println(name);
        proxy.detail();


    }
}

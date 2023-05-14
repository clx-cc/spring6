package com.cao.mall.client;

import com.cao.mall.service.OrderService;
import com.cao.mall.service.impl.OrderServiceImpl;
import com.cao.mall.service.impl.OrderServiceImplSub;
import com.cao.mall.service.impl.OrderServiceProxy;

public class Client {

    public static void main(String[] args) {
        //创建目标对象
        OrderService orderService = new OrderServiceImpl();
        //创建代理对象，将目标对象通过构造函数传递给代理对象
        OrderService proxy = new OrderServiceProxy(orderService);

        //执行代理对象的代理方法
        proxy.generate();
        proxy.detail();
        proxy.modify();

    }
}

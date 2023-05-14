package com.cao.mall.service.impl;

import com.cao.mall.service.OrderService;

public class OrderServiceProxy implements OrderService { //代理对象
    //目标对象
    OrderService target;

    //通过构造方法将目标对象传递给代理对象
    public OrderServiceProxy(OrderService orderService) {
        this.target = orderService;
    }

    @Override
    public void generate() { //代理方法
        long begin = System.currentTimeMillis();
        //执行目标对象的目标方法
        target.generate();
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end - begin)+"毫秒");

    }
    @Override
    public void detail() { //代理方法
        long begin = System.currentTimeMillis();
        //执行目标对象的目标方法
        target.detail();
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end - begin)+"毫秒");
    }

    @Override
    public void modify() { //代理方法
        long begin = System.currentTimeMillis();
        //执行目标对象的目标方法
        target.modify();
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end - begin)+"毫秒");
    }
}

package com.cao.proxy.service.impl;


import com.cao.proxy.service.OrderService;

public class OrderServiceImpl implements OrderService {//目标对象
    @Override
    public String getName() { //目标方法
        System.out.println("getName()方法执行");
        return "张三";
    }

    @Override
    public void general() { //目标方法
        System.out.println("正在生成订单.");

    }

    @Override
    public void modify() { //目标方法
        System.out.println("正在修改订单.");
    }

    @Override
    public void detail() { //目标方法
        System.out.println("正在查看订单详情.");
    }
}


package com.cao.mall.service.impl;

import com.cao.mall.service.OrderService;

/**
 * 要求：项目已经上线，只是有些地方运行速度缓慢，要求对项目进行优化。
 *      1、需要统计是哪些业务耗费的时间长，于是我们需要统计每个业务所耗费的时长
 * 实现方法：
 */
public class OrderServiceImpl implements OrderService { //目标对象
    @Override
    public void generate() { //目标方法
        System.out.println("正在生成订单...");
    }

    @Override
    public void detail() { //目标方法
        System.out.println("正在查看订单...");
    }

    @Override
    public void modify() { //目标方法
        System.out.println("正在修改订单...");
    }
}

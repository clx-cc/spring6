package com.cao.spring6.service;

import org.springframework.stereotype.Service;

@Service("orderService")
public class OrderService {//目标对象

    //生成订单的业务方法
    public void generate(){//目标方法
        System.out.println("正在生成订单...");
        //模拟异常
//        String str = null;
//        str.toString();
    }

    //取消订单的业务方法
    public void cancle(){//目标方法
        System.out.println("订单已取消...");
    }
}

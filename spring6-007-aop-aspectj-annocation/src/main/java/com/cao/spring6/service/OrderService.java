package com.cao.spring6.service;

import org.springframework.stereotype.Service;

@Service("orderService")
public class OrderService {
    public void generate(){
        System.out.println("生成订单");
//        String str = null;
//        str.toString();
    }
}

package com.cao.spring6.service;

import com.cao.spring6.dao.OrderDao;

public class OrderService {

    private OrderDao  orderDao;

    //通过set方法给属性赋值
    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void generate(){
        orderDao.insert();
    }
}

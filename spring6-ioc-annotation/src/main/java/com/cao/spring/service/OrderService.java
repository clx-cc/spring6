package com.cao.spring.service;

import com.cao.spring.dao.OrderDao;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
//    @Autowired//默认是根据类型装配
//    @Qualifier("orderDaoImplForMySql")//这个注解指定于根据名字装配

    @Resource(name = "orderDaoImplForMySql")
    private OrderDao orderDao;

    public void insert(){
        orderDao.insert();
    }
}

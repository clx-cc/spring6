package com.cao.spring.dao.impl;

import com.cao.spring.dao.OrderDao;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDaoImplForMySql implements OrderDao {
    @Override
    public void insert() {
        System.out.println("插入！");
    }
}

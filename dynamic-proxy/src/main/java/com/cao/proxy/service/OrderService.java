package com.cao.proxy.service;

public interface OrderService {//代理对象和目标对象共同实现的接口
    String getName();
    void general();
    void modify();
    void detail();
}

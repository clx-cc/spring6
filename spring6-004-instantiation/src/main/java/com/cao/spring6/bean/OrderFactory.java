package com.cao.spring6.bean;

public class OrderFactory {

    //工厂方法模式中的具体工厂角色的方法是：实例方法
    public Order get(){
        //实际上这个对象还是我们自己new的
        return new Order();
    }
}

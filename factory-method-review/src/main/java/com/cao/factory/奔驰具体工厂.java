package com.cao.factory;

//具体工厂角色
public class 奔驰具体工厂 extends 抽象工厂角色{
    @Override
    public Car 生产汽车() {
        return new Benz();
    }
}

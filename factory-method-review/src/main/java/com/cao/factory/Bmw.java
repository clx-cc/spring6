package com.cao.factory;

//具体产品角色：继承于抽象产品角色，创建具体产品对象的方法
public class Bmw extends Car{
    @Override
    public void 汽车鸣笛() {
        System.out.println("宝马汽车鸣笛");
    }
}

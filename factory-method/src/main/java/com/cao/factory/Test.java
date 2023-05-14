package com.cao.factory;

public class Test {
    public static void main(String[] args) {
        //第一步：先获得具体产品工厂的实例
        DaggerFactory daggerFactory = new DaggerFactory();
        //第二步：通过具体产品工厂的实例调用其实例方法get，获得具体产品对象
        Weapon dagger = daggerFactory.get();
        //第三步：使用具体产品对象调用其attack方法
        dagger.attack();

        //第一步：先获得具体产品工厂的实例
        GunFactory gunFactory = new GunFactory();
        //第二步：通过具体产品工厂的实例调用其实例方法get，获得具体产品对象
        Weapon gun = gunFactory.get();
        //第三步：使用具体产品对象调用其attack方法
        gun.attack();


    }
}

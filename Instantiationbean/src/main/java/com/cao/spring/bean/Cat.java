package com.cao.spring.bean;

//定义一个bean，实现公共接口
public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("cat吃饭");
    }
}

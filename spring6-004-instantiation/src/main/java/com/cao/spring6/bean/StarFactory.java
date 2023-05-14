package com.cao.spring6.bean;

public class StarFactory {

    /**
     * 工厂类中有一个静态方法
     * @return
     */
    public static Star get(){
        return new Star();
    }
}

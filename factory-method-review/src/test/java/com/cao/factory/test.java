package com.cao.factory;

/**
 * 工厂方法模式角色：
 *      抽象产品：具体产品的公共接口
 *      具体产品：继承抽象产品,定义自己实例的方法
 *      抽象工厂：具体工厂的公共接口
 *      具体工厂：继承抽象工厂，定义创建对应具体产品的方法
 *  工厂方法模式与简单工厂模式区别：
 *      简单工厂模式：
 *          一：是将生产产品的任务全都交给了一个工厂类来独自完成，这个工厂类的责任重大。
 *          二：是如果新增一个产品，需要修改工厂类的源代码，违背了ocp原则。
 *      工厂方法模式：
 *          一：将生产产品的任务延迟到了工厂类的子类来完成。
 *          二：是每一个产品都有一个工厂类
 */
public class test {
    public static void main(String[] args) {
        //工厂方法模式生产产品步骤
        //1、创建每个产品的具体工厂实例
        宝马具体工厂 宝马工厂 = new 宝马具体工厂();
        //2、通过具体工厂实例调用其实例方法，获得具体产品
        Car 汽车1 = 宝马工厂.生产汽车();
        //3、使用具体产品
        汽车1.汽车鸣笛();

    }
}

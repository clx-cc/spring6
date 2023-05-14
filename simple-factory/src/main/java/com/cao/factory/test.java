package com.cao.factory;

public class test {
    public static void main(String[] args) {
        //需要坦克
        Weapon tank = WeaponFactory.get("TANK");
        tank.attack();
        //对于客户端来说，坦克的生产细节我不需要关心，我只需要向工厂索要即可
        //简单工厂模式达到了职责分离，客户端不需要关心产品的生产细节
        //客户端只负责消费，工厂类负责生产，一个负责生产，一个负责消费，生产者和消费者分离了。这就是简单工厂模式的作用。
        //需要战斗机
        Weapon fighter = WeaponFactory.get("FIGHTER");
        fighter.attack();
        //需要枪
        Weapon gun = WeaponFactory.get("GUN");
        gun.attack();

    }
}

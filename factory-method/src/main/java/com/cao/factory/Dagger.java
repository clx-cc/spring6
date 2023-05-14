package com.cao.factory;

/**
 * 具体产品角色
 * @className Dagger
 */
public class Dagger extends Weapon {
    @Override
    public void attack() {
        System.out.println("砍它！！！！");
    }
}

package com.cao.factory;

/**
 * 具体产品角色
 * @className Gun
 */
public class Gun extends Weapon{
    @Override
    public void attack() {
        System.out.println("开枪了！！");
    }
}

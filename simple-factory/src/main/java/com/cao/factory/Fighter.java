package com.cao.factory;

/**
 * 战斗机（具体产品角色）
 */
public class Fighter extends Weapon{
    @Override
    public void attack() {
        System.out.println("战斗机投下导弹");
    }
}

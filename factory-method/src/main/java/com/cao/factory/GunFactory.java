package com.cao.factory;
/**
 * 具体工厂角色
 * @className GunFactory
 */
public class GunFactory extends WeaponFactory{
    @Override
    public Weapon get() {
        return new Gun();
    }
}

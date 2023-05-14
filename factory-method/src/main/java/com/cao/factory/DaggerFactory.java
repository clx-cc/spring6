package com.cao.factory;

/**
 * 具体工厂角色
 * @className DaggerFactory
 */
public class DaggerFactory extends WeaponFactory{
    @Override
    public Weapon get() {
        return new Dagger();
    }
}

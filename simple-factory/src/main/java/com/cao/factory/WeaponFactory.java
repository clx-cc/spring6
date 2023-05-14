package com.cao.factory;

public class WeaponFactory {
    /**
     * 根据不同的武器类型生产武器
     * 简单工厂模式中有一个静态方法，所以被称为：静态 工厂方法模式。
     * @param weaponType 武器类型
     * @return 武器对象
     */
    public static Weapon get(String weaponType){
        if (weaponType == null || weaponType.trim().length() == 0) {
            return null;
        }
        Weapon weapon = null;
        if ("TANK".equals(weaponType)) {
            weapon = new Tank();
        } else if ("FIGHTER".equals(weaponType)) {
            weapon = new Fighter();
        } else if ("GUN".equals(weaponType)) {
            weapon = new Gun();
        } else {
            throw new RuntimeException("不支持该武器！");
        }
        return weapon;
    }
}

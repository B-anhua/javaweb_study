package com.powernode.factory.method;

/**
 * @PROJECT_NAME: spring6
 * @className: Test
 * @version: 1.0
 * @description:
 * @author: B-anhua
 * @date: 2022-12-07 00:40
 **/

public class Test {
    public static void main(String[] args) {
        WeaponFactory weaponFactory = new DaggerFactory();
        Weapon dagger = weaponFactory.get();
        dagger.attack();
        WeaponFactory weaponFactory1 = new GunFactory();
        Weapon gun = weaponFactory1.get();
        gun.attack();
        WeaponFactory weaponFactory2 = new TankFactory();
        Weapon tank = weaponFactory2.get();
        tank.attack();
    }
}

package com.powernode.factory.method;

/**
 * 具体工厂角色
 * @PROJECT_NAME: spring6
 * @className: GunFactory
 * @version: 1.0
 * @description:
 * @author: B-anhua
 * @date: 2022-12-07 00:34
 **/

public class GunFactory extends WeaponFactory{

    @Override
    public Weapon get() {
        return new Gun();
    }
}

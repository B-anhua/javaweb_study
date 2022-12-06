package com.powernode.factory.method;

/**
 * 具体工厂角色
 * @PROJECT_NAME: spring6
 * @className: DaggerFactory
 * @version: 1.0
 * @description:
 * @author: B-anhua
 * @date: 2022-12-07 00:33
 **/

public class DaggerFactory extends WeaponFactory{
    @Override
    public Weapon get() {
        return new Dagger();
    }
}

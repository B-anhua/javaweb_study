package com.powernode.factory.method;

/**
 * @PROJECT_NAME: spring6
 * @className: TankFactory
 * @version: 1.0
 * @description:
 * @author: B-anhua
 * @date: 2022-12-07 00:36
 **/

public class TankFactory extends WeaponFactory{
    @Override
    public Weapon get() {
        return new Tank();
    }
}

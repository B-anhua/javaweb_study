package com.powernode.factory.method;

/**
 * @PROJECT_NAME: spring6
 * @className: WeaponFactory
 * @version: 1.0
 * @description:
 * @author: B-anhua
 * @date: 2022-12-07 00:31
 **/

abstract public class WeaponFactory {
    /**
     * 这个方法不是静态的，是实列方法
     * @return
     */
    public abstract Weapon get();
}

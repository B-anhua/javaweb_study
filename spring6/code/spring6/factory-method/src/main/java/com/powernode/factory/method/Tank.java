package com.powernode.factory.method;

/**
 * @PROJECT_NAME: spring6
 * @className: TANK
 * @version: 1.0
 * @description:
 * @author: B-anhua
 * @date: 2022-12-07 00:27
 **/

public class Tank extends Weapon{
    @Override
    public void attack() {
        System.out.println("开炮！！！！");
    }
}

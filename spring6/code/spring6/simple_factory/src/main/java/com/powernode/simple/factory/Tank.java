package com.powernode.simple.factory;

/**
 * 具体产品角色
 * @PROJECT_NAME: spring6
 * @className: Tank
 * @version: 1.0
 * @description:
 * @author: B-anhua
 * @date: 2022-12-06 22:24
 **/

public class Tank extends Weapon{
    @Override
    public void attack() {
        System.out.println("坦克开炮");
    }
}

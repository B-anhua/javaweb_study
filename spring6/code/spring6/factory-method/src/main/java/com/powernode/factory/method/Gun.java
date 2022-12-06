package com.powernode.factory.method;

/**
 * 具体产品角色
 * @PROJECT_NAME: spring6
 * @className: Gun
 * @version: 1.0
 * @description:
 * @author: B-anhua
 * @date: 2022-12-07 00:29
 **/

public class Gun extends Weapon{
    @Override
    public void attack() {
        System.out.println("开枪射击");
    }
}

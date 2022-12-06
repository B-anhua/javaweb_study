package com.powernode.simple.factory;

/**
 * 具体产品角色
 * @PROJECT_NAME: spring6
 * @className: Dagger
 * @version: 1.0
 * @description:
 * @author: B-anhua
 * @date: 2022-12-06 22:27
 **/

public class Dagger extends Weapon{
    @Override
    public void attack() {
        System.out.println("砍丫的！！！");
    }
}

package com.powernode.simple.factory;

/**
 * 具体产品角色
 * @PROJECT_NAME: spring6
 * @className: Fighter
 * @version: 1.0
 * @description:
 * @author: B-anhua
 * @date: 2022-12-06 22:26
 **/

public class Fighter extends Weapon{
    @Override
    public void attack() {
        System.out.println("战斗机抛下小男孩");
    }
}

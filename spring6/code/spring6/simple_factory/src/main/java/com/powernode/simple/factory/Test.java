package com.powernode.simple.factory;

/**
 * @PROJECT_NAME: spring6
 * @className: Test
 * @version: 1.0
 * @description:
 * @author: B-anhua
 * @date: 2022-12-06 22:41
 **/

public class Test {
    public static void main(String[] args) {


        //需要相克
        //对于我客户端来说,坦克的生产留节,我不需要关心,我只需要向工厂索要即可。
        //简单工厂模式达到了什么呢?职资分高,客户端不需要关心产品的生产细节。
        //客户端只负责消费,工厂类负责生产,一个负责生产,一个负责消费,生产者和消费者分离了。这就是简单工厂模式的作用。
        Weapon tank = WeaponFactory.get("TANK");
        tank.attack();
        //需要ヒ首
        Weapon dagger = WeaponFactory.get("DAGGER");
        dagger.attack();
        //需要战斗机
        Weapon fighter = WeaponFactory.get("FIGHTER");
        fighter.attack();
    }
}

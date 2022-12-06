package com.powernode.spring6.bean;

/**
 * 简单工厂模式中的工厂类角色，新工厂
 * @PROJECT_NAME: spring6
 * @className: StarFactory
 * @version: 1.0
 * @description:
 * @author: B-anhua
 * @date: 2022-12-07 01:12
 **/

public class StarFactory {
    //工厂类中有一个静态方法。
    //简单工厂模式又叫做：静态工厂方法模式。
    public static Star get(){
        //这个star对象最终实际上创建的时候还是我们负资new的对象。
        return  new Star();
    }
}

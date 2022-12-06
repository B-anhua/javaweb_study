package com.powernode.simple.factory;



/**
 * 工厂类角色
 * @PROJECT_NAME: spring6
 * @className: WeaponFactory
 * @version: 1.0
 * @description:
 * @author: B-anhua
 * @date: 2022-12-06 22:29
 **/

/*.简单工厂模式的缺点?
        缺点一:假设现在需要扩展一个新的产品, WeaponFactory工厂类的代码是需要修改的,显然违背了OCP原则。
        缺点二:工厂类的责任比较重大,不能出现任何问题,因为这个工厂类负责所有产品的生产,称为全能类,或者有人把它叫做上帝类。
        这个工厂类一旦出问题,整个系统必然全部瘫疾。(不要把所有鸡蛋放到一个篮子里面哦。)*/
public class WeaponFactory {

    /**
     * 静态方法,要获取什么产品?就看你传什么参数,传TANK获取坦克,传DAGGER获取匕首,传FIGHTER获取战斗机
     * 简单工广模中有一个静法。所以被称为：静态工厂方法模式。
     * @param weaponType
     * @return
     *
     */
    public static Weapon get(String weaponType){
        if ("TANK".equals(weaponType)) {
            return new Tank();
        }else if ("DAGGER".equals(weaponType)){
            return new Dagger();
        } else if ("FIGHTER".equals(weaponType)) {
            return new Fighter();
        } else{
            throw new RuntimeException("不支持该武器的生产");
        }

    }
}

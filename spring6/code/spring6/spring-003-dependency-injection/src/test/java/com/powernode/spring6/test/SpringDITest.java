package com.powernode.spring6.test;

import com.powernode.spring6.bean.Cat;
import com.powernode.spring6.bean.Dog;
import com.powernode.spring6.bean.MathBean;
import com.powernode.spring6.bean.People;
import com.powernode.spring6.jdbc.MyDateSource;
import com.powernode.spring6.jdbc.MyDateSource1;
import com.powernode.spring6.jdbc.MyDateSource2;
import com.powernode.spring6.service.OrderService;
import com.powernode.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.Date;


/**
 * @PROJECT_NAME: spring6
 * @className: SpringDITest
 * @version: 1.0
 * @description:
 * @author: B-anhua
 * @date: 2022-12-04 23:23
 **/

public class SpringDITest {
    public static void main(String[] args) {
        System.out.println(new Date());
    }

    @Test
    public void testProperties(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-properties.xml");
        MyDateSource ds = applicationContext.getBean("ds", MyDateSource.class);
        System.out.println(ds);

    }

    @Test
    public  void testAutoWire(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-autowire.xml");
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.generate();

    }

    @Test
    public void testUtil(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-util.xml");
        MyDateSource1 ds1 = applicationContext.getBean("ds1", MyDateSource1.class);
        MyDateSource2 ds2 = applicationContext.getBean("ds2", MyDateSource2.class);
        System.out.println(ds1 );
        System.out.println(ds2);
    }
    @Test
    public void  testC(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-c.xml");
        People peopleBean = applicationContext.getBean("peopleBean", People.class);
        System.out.println(peopleBean);
    }

    @Test
    public void tsetP(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-p.xml");
        Dog dogBean = applicationContext.getBean("dogBean", Dog.class);
        System.out.println(dogBean);
    }

    @Test
    public void testSpecial(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        MathBean mathBean = applicationContext.getBean("mathBean" ,MathBean.class);
        System.out.println(mathBean);
    }

    @Test
   public void testNull(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        Cat catBean = applicationContext.getBean("catBean", Cat.class);
        System.out.println(catBean.getName().toUpperCase());
    }

    @Test
    public void testSetDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userServiceBean = applicationContext.getBean("userServiceBean", UserService.class);
        userServiceBean.saveUser();
    }
}

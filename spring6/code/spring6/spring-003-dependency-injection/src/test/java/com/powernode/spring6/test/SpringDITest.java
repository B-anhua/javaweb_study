package com.powernode.spring6.test;

import com.powernode.spring6.bean.Cat;
import com.powernode.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @PROJECT_NAME: spring6
 * @className: SpringDITest
 * @version: 1.0
 * @description:
 * @author: B-anhua
 * @date: 2022-12-04 23:23
 **/

public class SpringDITest {


    @Test
   public void testNull(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        Cat catBean = applicationContext.getBean("catBean", Cat.class);
        System.out.println(catBean);
    }

    @Test
    public void testSetDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userServiceBean = applicationContext.getBean("userServiceBean", UserService.class);
        userServiceBean.saveUser();
    }
}

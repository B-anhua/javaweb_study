package com.powernode.spring6.test;

import com.powernode.spring6.bean.SpringBean;
import com.powernode.spring6.bean.Star;
import com.powernode.spring6.bean.StarFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @PROJECT_NAME: spring6
 * @className: BeanInstantiationTest
 * @version: 1.0
 * @description:
 * @author: B-anhua
 * @date: 2022-12-07 00:58
 **/

public class BeanInstantiationTest {

    @Test
    public void testInstantiation2(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("spring.xml");
        Star star = applicationContext.getBean("starBean", Star.class);
        System.out.println(star);

    }

    @Test
    public void testInstantiation(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("spring.xml");
        SpringBean sb = applicationContext.getBean("sb", SpringBean.class);
        System.out.println(sb);

    }

}

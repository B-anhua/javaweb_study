package com.powernode.spring6test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @PROJECT_NAME: spring6-002-first
 * @className: FirstSpringTest
 * @version: 1.0
 * @description:
 * @author: B-anhua
 * @date: 2022-12-04 17:38
 **/

public class FirstSpringTest {

    @Test
    public void testBeginInitBean(){
        //注意:不是在调用getBean()方法的时候创建对象,执行以下代码的时候,就会实例化对象。
        new ClassPathXmlApplicationContext("spring.xml");
        //你自己怎么去使用Log4j2记录日志信息呢?
        // 第一步:创建日志记录器对象
        // 获取FirstSpringTest类的日志记录器对象,也就是说只要是FirstSpringTest类中的代码执行记录日志的话,就输出相关的日志信息。
        Logger logger = LoggerFactory.getLogger(FirstSpringTest.class);
        logger.info("我是一条消息");
        logger.debug("我是一条调试信息");
        logger.error("我是一条错误信息");
    }

    @Test
    public void testSpringCode(){
        //第一步，获取Spring容器对象
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
       //第二步，通过ID从spring容器中获取对象
        Object userBean = applicationContext.getBean("userBean");
        System.out.println(userBean);

        Object userDaoBean = applicationContext.getBean("userDaoBean");
        System.out.println(userDaoBean);

    }
}

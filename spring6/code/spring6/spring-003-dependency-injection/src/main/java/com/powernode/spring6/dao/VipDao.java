package com.powernode.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @PROJECT_NAME: spring6
 * @className: VipDao
 * @version: 1.0
 * @description:
 * @author: B-anhua
 * @date: 2022-12-04 23:59
 **/

public class VipDao {
    private static final Logger logger = LoggerFactory.getLogger(VipDao.class);

    public void insert(){
        logger.info("数据库信息正在保存VIP信息");
        System.out.println(123);
    }
}

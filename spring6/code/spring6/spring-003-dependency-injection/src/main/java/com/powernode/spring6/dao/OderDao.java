package com.powernode.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @PROJECT_NAME: spring6
 * @className: OderDao
 * @version: 1.0
 * @description:
 * @author: B-anhua
 * @date: 2022-12-06 02:02
 **/

public class OderDao {
	private static final Logger logger = LoggerFactory.getLogger("OrderDao.class");

	public void insert(){
		logger.info("订单正在生成");
	}
}

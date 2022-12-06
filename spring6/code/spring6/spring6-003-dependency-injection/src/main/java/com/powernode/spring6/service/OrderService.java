package com.powernode.spring6.service;

import com.powernode.spring6.dao.OderDao;

/**
 * @PROJECT_NAME: spring6
 * @className: OrderService
 * @version: 1.0
 * @description:
 * @author: B-anhua
 * @date: 2022-12-06 02:06
 **/

public class OrderService {

	private OderDao orderDao;
	//通过set给属性赋值

	public void setOrderDao(OderDao orderDao) {
		this.orderDao = orderDao;
	}

	public void generate(){
		orderDao.insert();
	}
}

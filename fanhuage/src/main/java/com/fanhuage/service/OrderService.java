package com.fanhuage.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.fanhuage.common.R;
import com.fanhuage.domain.Member;
import com.fanhuage.domain.Orders;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.core.annotation.Order;

/**
* @author 71439
* @description 针对表【order】的数据库操作Service
* @createDate 2023-05-08 16:37:12
*/
public interface OrderService extends IService<Orders> {

    R<IPage> getPaginatedOder(int page, int size, String query);
    R<String> addOrder(Orders order);

    void removeOrder(String id);

    R<String> upOrderById(Orders order);

}

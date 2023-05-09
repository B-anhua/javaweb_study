package com.fanhuage.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fanhuage.common.R;
import com.fanhuage.domain.Member;
import com.fanhuage.domain.Orders;
import com.fanhuage.domain.Orders;
import com.fanhuage.service.OrderService;
import com.fanhuage.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 71439
 * @description 针对表【order】的数据库操作Service实现
 * @createDate 2023-05-08 16:37:12
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Orders>
        implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public R<IPage> getPaginatedOder(int page, int size, String query) {
        int offset = page;

        int limit = size;

        LambdaQueryWrapper<Orders> queryWrapper = new LambdaQueryWrapper<>();
        if (!query.isEmpty()) {
            queryWrapper.like(Orders::getCustomerName, query)
                    .or()
                    .like(Orders::getOrderId, query)
                    .or()
                    .like(Orders::getOrderName, query)
                    .or()
                    .like(Orders::getOrderPhone, query)
                    .or()
                    .like(Orders::getOrderStatus, query)
                    .or()
                    .like(Orders::getOrderAddress, query);
        }

        IPage pageObj = new Page(offset, limit);
        pageObj = orderMapper.selectPage(pageObj, queryWrapper);

        return R.success(pageObj);    }

    @Override
    public R<String> addOrder(Orders order) {

        orderMapper.insert(order);
        return R.success("新增订单成功");
    }

    @Override
    public void removeOrder(String id) {
        orderMapper.deleteById(id);
    }

    @Override
    public R<String> upOrderById(Orders order) {
        orderMapper.updateById(order);
        return null;
    }


}





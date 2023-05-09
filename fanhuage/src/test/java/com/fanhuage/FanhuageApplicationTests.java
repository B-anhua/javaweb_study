package com.fanhuage;

import com.fanhuage.common.MyMetaObjectHandler;
import com.fanhuage.domain.Flower;
import com.fanhuage.domain.Orders;
import com.fanhuage.domain.User;
import com.fanhuage.mapper.FlowerMapper;
import com.fanhuage.mapper.OrderMapper;
import com.fanhuage.mapper.UserMapper;
import com.fanhuage.service.OrderService;
import com.fanhuage.service.UserService;
import com.fanhuage.service.impl.FlowerServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@SpringBootTest
class FanhuageApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;
    @Autowired
    private FlowerMapper flowerMapper;
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderService orderService;

    @Test
    void name() {
        List<Flower> flowers = flowerMapper.selectList(null);
        System.out.println(flowers);
    }

    @Test
    void testMapper() {
        List<User> userList = userMapper.selectList(null);
        System.out.println(userList);
    }

/*    @Test
    void testService() {
        User byId = userService.getById(1l);
        System.out.println(byId);

    }*/

    @Test
    void test1(){
        Orders order = new Orders();
        order.setOrderId(MyMetaObjectHandler.generateOrderNo());
        order.setCustomerName("高启强");
        order.setOrderAddress("北京市海淀区");
        order.setOrderStatus(0);
        order.setCreateTime(new Date());
        order.setOrderNum(999);
        order.setOrderAmount(1314D);
        orderMapper.insert(order);


    }
    @Test
    void test2(){
        Orders orders = new Orders();
        orders.setOrderId(MyMetaObjectHandler.generateOrderNo());
        orders.setCustomerName("John");
        orders.setOrderAddress("北京市海淀区");
        orders.setOrderStatus(0);
        orders.setCreateTime(new Date());
        List<Orders> order1 = orderMapper.selectList(null);
        System.out.println(order1);


    }


}

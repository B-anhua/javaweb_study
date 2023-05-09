package com.fanhuage.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.fanhuage.common.R;
import com.fanhuage.domain.Member;
import com.fanhuage.domain.Orders;
import com.fanhuage.service.MemberService;
import com.fanhuage.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @PROJECT_NAME: fanhuage
 * @className: MemberController
 * @version: 1.0
 * @description:
 * @author: LuoJie
 * @date: 2023-05-04 17:10
 */
@Slf4j
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    //分页搜索查询会员列表
    @GetMapping("/getOrder")
    public R<IPage> goods(@RequestParam(value = "currentPage", defaultValue = "1") int page,
                          @RequestParam(value = "pageSize", defaultValue = "10") int size,
                          @RequestParam(value = "query", defaultValue = "") String query) {
        // List<Flower> flowers = flowerService.getPaginatedFlowers(page, size, query);
        // return R.success(flowers);
        return orderService.getPaginatedOder(page, size, query);

    }

    /*新增会员*/
    @PostMapping("/addOrder")
    public R<String> addMember(@RequestBody Orders order) {
        return orderService.addOrder(order);
    }


    /*修改会员*/
    @PutMapping("/updateOrder")
    public R<String> updateFlower(@RequestBody Orders order){
        orderService.upOrderById(order);
        return R.success("订单信息修改成功");
    }


    /*删除会员*/
    @DeleteMapping("/deleteOrder")
    public R<String> delete(@RequestBody String id) {
        orderService.removeOrder(id);
        return R.success("删除成功");
    }
}

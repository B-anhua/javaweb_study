package com.fanhuage.mapper;

import com.fanhuage.domain.Orders;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
* @author 71439
* @description 针对表【order】的数据库操作Mapper
* @createDate 2023-05-08 16:37:12
* @Entity com.fanhuage.domain.Order
*/

@Mapper
public interface OrderMapper extends BaseMapper<Orders> {

}





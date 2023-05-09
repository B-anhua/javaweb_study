package com.fanhuage.mapper;

import com.fanhuage.domain.Flower;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 71439
* @description 针对表【flower】的数据库操作Mapper
* @createDate 2023-04-27 03:40:53
* @Entity com.fanhuage.domain.Flower
*/
@Mapper
public interface FlowerMapper extends BaseMapper<Flower> {

}





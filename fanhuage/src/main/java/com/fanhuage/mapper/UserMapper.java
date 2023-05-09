package com.fanhuage.mapper;

import com.fanhuage.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 71439
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-04-27 03:39:59
* @Entity com.fanhuage.domain.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}





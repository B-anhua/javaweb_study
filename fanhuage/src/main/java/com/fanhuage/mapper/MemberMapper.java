package com.fanhuage.mapper;

import com.fanhuage.domain.Member;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 71439
* @description 针对表【member】的数据库操作Mapper
* @createDate 2023-05-04 16:59:13
* @Entity com.fanhuage.domain.Member
*/

@Mapper
public interface MemberMapper extends BaseMapper<Member> {

}





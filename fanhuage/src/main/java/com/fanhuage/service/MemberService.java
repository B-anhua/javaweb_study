package com.fanhuage.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.fanhuage.common.R;
import com.fanhuage.domain.Flower;
import com.fanhuage.domain.Member;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 71439
* @description 针对表【member】的数据库操作Service
* @createDate 2023-05-04 16:59:13
*/
public interface MemberService extends IService<Member> {

    R<IPage> getPaginatedMerber(int page, int size, String query);

    R<String> addMember(Member member);

    void removeMember(String id);

    R<String> upMemberById(Member member);

}

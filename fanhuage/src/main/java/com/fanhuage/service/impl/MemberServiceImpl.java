package com.fanhuage.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fanhuage.common.R;
import com.fanhuage.domain.Flower;
import com.fanhuage.domain.Member;
import com.fanhuage.service.MemberService;
import com.fanhuage.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
* @author 71439
* @description 针对表【member】的数据库操作Service实现
* @createDate 2023-05-04 16:59:13
*/
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member>
    implements MemberService{

@Autowired
private MemberMapper memberMapper;
    @Override
    public R<IPage> getPaginatedMerber(int page, int size, String query) {
        int offset = page;
        // int offset = (page - 1) * size;

        int limit = size;

        LambdaQueryWrapper<Member> queryWrapper = new LambdaQueryWrapper<>();
        if (!query.isEmpty()) {
            queryWrapper.like(Member::getName, query)
                    .or()
                    .like(Member::getEmail, query)
                    .or()
                    .like(Member::getPhone, query);
        }


        // Page pageObj = new Page(page, size);
        // pageObj = this.page(pageObj, queryWrapper);

        IPage pageObj = new Page(offset, limit);
        pageObj = memberMapper.selectPage(pageObj, queryWrapper);

        return R.success(pageObj);
    }


    @Override
    public R<String> addMember(Member member) {
        LambdaQueryWrapper<Member> queryWrapper = new LambdaQueryWrapper<>();

        queryWrapper.eq(Member::getName, member.getName());
        List<Member> Member = memberMapper.selectList(queryWrapper);
        if (!Member.isEmpty()) {
            return R.error("用户名已存在");
        }

        List<Member> Member1 = memberMapper.selectList(new QueryWrapper<Member>().eq("email",member.getEmail()));
        if (!Member1.isEmpty()) {
            return R.error("邮箱已存在");
        }
        List<Member> Member2 = memberMapper.selectList(new QueryWrapper<Member>().eq("phone",member.getPhone()));
        if (!Member2.isEmpty()) {
            return R.error("手机号已存在");
        }
        System.out.println("=================");
        System.out.println(Member);
/*        long time = new Date().getTime();
        member.setCreatedAt(time);*/
        memberMapper.insert(member);
        return R.success("新增用户成功");

    }


    @Override
    public void removeMember(String id) {
        memberMapper.deleteById(id);
    }

    @Override
    public R<String> upMemberById(Member member) {
        memberMapper.updateById(member);
        return null;
    }
}





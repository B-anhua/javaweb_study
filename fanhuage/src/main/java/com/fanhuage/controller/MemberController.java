package com.fanhuage.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.fanhuage.common.R;

import com.fanhuage.domain.Flower;
import com.fanhuage.domain.Member;
import com.fanhuage.service.MemberService;
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
public class MemberController {
    @Autowired
    private MemberService memberService;

    //分页搜索查询会员列表
    @GetMapping("/getMember")
    public R<IPage> goods(@RequestParam(value = "currentPage", defaultValue = "1") int page,
                          @RequestParam(value = "pageSize", defaultValue = "10") int size,
                          @RequestParam(value = "query", defaultValue = "") String query) {
        // List<Flower> flowers = flowerService.getPaginatedFlowers(page, size, query);
        // return R.success(flowers);
        return memberService.getPaginatedMerber(page, size, query);

    }

    /*新增会员*/
    @PostMapping("/addMember")
    public R<String> addMember(@RequestBody Member member) {
        return memberService.addMember(member);
    }


    /*修改会员*/
    @PutMapping("/updateMember")
    public R<String> updateFlower(@RequestBody Member member){
        memberService.upMemberById(member);
        return R.success("用户信息修改成功");
    }


    /*删除会员*/
    @DeleteMapping("/deleteMember")
    public R<String> delete(@RequestBody String id) {
        memberService.removeMember(id);
        return R.success("删除成功");
    }
}

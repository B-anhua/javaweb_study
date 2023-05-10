package com.fanhuage.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fanhuage.common.R;
import com.fanhuage.domain.User;
import com.fanhuage.service.UserService;
import com.fanhuage.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 71439
 * @description 针对表【user】的数据库操作Service实现
 * @createDate 2023-04-27 03:39:59
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public R<User> login(HttpServletRequest request,User user) {
        String uPassword = user.getUpassword();
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUname, user.getUname());
        User data = userMapper.selectOne(queryWrapper);
        if (data == null) {
            return R.error("用户不存在,请先注册");
        }
        if (!data.getUpassword().equals(uPassword)) {
            return R.error("密码错误");
        }
        request.getSession().setAttribute("user",user.getUname());
        return R.success(user);
    }

    @Override
    public R<String> sign(User user) {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUname, user.getUname());
        User data = userMapper.selectOne(queryWrapper);
        if (data != null) {
            return R.error("用户名已存在,请重新输入注册信息");
        }
        userMapper.insert(user);
        return R.success("注册成功");
    }

}





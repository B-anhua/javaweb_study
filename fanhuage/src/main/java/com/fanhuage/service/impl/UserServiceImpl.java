package com.fanhuage.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fanhuage.domain.User;
import com.fanhuage.service.UserService;
import com.fanhuage.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public boolean login(User user) {
        String uPassword = user.getUpassword();
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUname, user.getUname());
        User data = userMapper.selectOne(queryWrapper);
        if (data == null) {
            return false;
        }
        if (!data.getUpassword().equals(uPassword)) {
            return false;
        }
        return true;
    }

}





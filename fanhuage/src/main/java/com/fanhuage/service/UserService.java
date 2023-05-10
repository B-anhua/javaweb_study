package com.fanhuage.service;

import com.fanhuage.common.R;
import com.fanhuage.domain.User;
import com.sun.xml.internal.fastinfoset.algorithm.BooleanEncodingAlgorithm;

import javax.servlet.http.HttpServletRequest;

/**
* @author 71439
* @description 针对表【user】的数据库操作Service
* @createDate 2023-04-27 03:39:59
*/
public interface UserService {
    R<User> login(HttpServletRequest request, User user);

    R<String> sign(User user);

}

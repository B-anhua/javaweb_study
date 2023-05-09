package com.fanhuage.controller;

import com.fanhuage.common.R;
import com.fanhuage.domain.User;
import com.fanhuage.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @PROJECT_NAME: fanhuage
 * @className: UserController
 * @version: 1.0
 * @description:
 * @author: LuoJie
 * @date: 2023-04-26 19:18
 */
@Slf4j
@RestController
// @RequestMapping("/fanhuage")
public class LoginController {

    @Autowired
    private UserService userService;


    // @CrossOrigin
    @PostMapping("/login")
    public R<User> login(HttpServletRequest request, @RequestBody User user) {

        boolean login = userService.login(user);
        if (!login) {
            return R.error("用户名或密码错误");
        }


        request.getSession().setAttribute("user", user.getUname());
/*        Object user1 = request.getSession().getAttribute("user");
        System.out.println(user1);*/
        return R.success(user);

    }

    @PostMapping("/logout")
    public R<String> logout(HttpServletRequest request) {

      request.getSession().removeAttribute("user");
        System.out.println(request.getSession().getAttribute("user"));
    return null;
    }
}





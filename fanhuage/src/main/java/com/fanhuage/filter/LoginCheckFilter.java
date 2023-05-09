package com.fanhuage.filter;

import com.alibaba.fastjson.JSON;
import com.fanhuage.common.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.AntPathMatcher;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @PROJECT_NAME: fanhuage
 * @className: LoginCheckFilter
 * @version: 1.0
 * @description: 登录检查过滤器
 * @author: LuoJie
 * @date: 2023-05-05 17:43
 */

@Slf4j
@WebFilter(filterName = "loginCheckFilter", urlPatterns = "/*")
public class LoginCheckFilter implements Filter {

    // 路径匹配器，支持通配符
    public static final AntPathMatcher PATH_MATCHER = new AntPathMatcher();

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;

        // 获取本次请求的URI
        String requestURL = request.getRequestURI();
        // log.info("拦截请求:{}", requestURL);

        // 定义不需要处理的请求路径
        String[] urls = new String[]{
                "/login",
                "logout",
                "http://127.0.0.1:5173/src/assets/*"
        };
        // 判断本次请求是否需要处理

        boolean check = check(urls, requestURL);
        if (check){
            log.info("拦截放行:{}", requestURL);
            filterChain.doFilter(request, response);
            return;
        }
        if (request.getSession().getAttribute("user")!=null){

            log.info("用户已登录:{}", request.getSession().getAttribute("user"));
            filterChain.doFilter(request, response);
            return;
        }

        log.info("用户未登录");
        response.getWriter().write((JSON.toJSONString(R.error("NOTLOGIN"))));

        // filterChain.doFilter(request, response);
    }

    /***
     * @methodName: check
     * @description: 路径匹配，检查本次请求是否需要放行
     * @Author: LuoJie
     * @param: urls
     * @param: requestUrl
     * @updateTime: 2023-05-05 23:05
     * @return: boolean
     */
    public boolean check(String[] urls, String requestUrl) {
        for (String url : urls) {
            boolean match = PATH_MATCHER.match(url, requestUrl);
            if(match){
                return true;
            }
        }
        return false;
    }
}

package com.vacant.myblog.interceptor;

import com.vacant.myblog.entity.User;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description:
 * @author: link(dingshengxiao)
 * @date: 2019/5/6 14:21
 */
public class BackInterceptor implements HandlerInterceptor {

    private static final String username = "vacant";
    private static final String password = "123456";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        boolean flag = true;
        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            flag = false;
        } else {
            // 验证账户
            if (!user.getUsername().equals(username)
                    || !user.getPassword().equals(password)) {
                flag = false;
            }
        }
        return flag;
    }
}

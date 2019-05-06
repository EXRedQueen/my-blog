package com.vacant.myblog.config;

import com.vacant.myblog.interceptor.BackInterceptor;
import com.vacant.myblog.interceptor.ForeInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @description: 自定义拦截器
 * @author: link(dingshengxiao)
 * @date: 2019/5/6 14:34
 */
@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new BackInterceptor()).addPathPatterns("/admin/**").excludePathPatterns("/toLogin");
        //registry.addInterceptor(new ForeInterceptor()).addPathPatterns("/**").excludePathPatterns("/toLogin","/admin/**");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/admin/login").setViewName("login.html");
    }
}

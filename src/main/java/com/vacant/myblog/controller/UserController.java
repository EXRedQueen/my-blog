package com.vacant.myblog.controller;

import com.vacant.myblog.common.DataObject;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description: 用户控制类
 * @author: link(dingshengxiao)
 * @date: 2019/5/6 16:47
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @ApiOperation("用户注册")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "昵称", required = true, dataType = "String"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, dataType = "String")})
    @PostMapping("/signup")
    public DataObject signUp(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        logger.info(name);
        DataObject dataObject = new DataObject();
        dataObject.data("注册成功");
        return dataObject;
    }
}

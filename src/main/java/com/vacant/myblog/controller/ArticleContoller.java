package com.vacant.myblog.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 文章信息Controller层
 * @author: link(dingshengxiao)
 * @date: 2019/5/6 11:00
 */
@RestController
@RequestMapping("/api/article")
public class ArticleContoller {

    @ApiOperation("获取文章列表")
    @ApiImplicitParam(name = "id", value = "文章id", required = true, dataType = "Long")
    @GetMapping("/list")
    public String listAllArticle() {
        return "测试成功";
    }

}

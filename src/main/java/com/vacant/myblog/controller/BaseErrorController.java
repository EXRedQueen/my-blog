package com.vacant.myblog.controller;

import com.vacant.myblog.exception.BlogException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: link(dingshengxiao)
 * @date: 2019/5/6 16:15
 */
@Controller
public class BaseErrorController {

    private static final Logger logger = LoggerFactory.getLogger(BaseErrorController.class);

    @RequestMapping("/json")
    public void json(ModelMap modelMap) {
        logger.info(modelMap.get("author").toString());
        logger.info("-----------------------------------");
        try {
            int i = 5 / 0;
        } catch (Exception e) {
            throw new BlogException("计算公式异常", e);
        }

    }
}

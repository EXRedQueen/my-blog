package com.vacant.myblog.exception;

import com.vacant.myblog.common.DataObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @description: 全局异常处理
 * @author: link(dingshengxiao)
 * @date: 2019/5/6 16:19
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        logger.info("存在请求参数");
    }

    /**
     * 把值绑定到Model中，使全局@RequestMapping可以获取到该值
     *
     * @param model
     */
    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("author", "Vacant");
    }

    /**
     * 全局异常处理
     *
     * @param e 异常信息
     * @return
     */
    @ExceptionHandler(Exception.class)
    public DataObject handleException(Exception e) {
        DataObject dataObject = new DataObject();
        if (e instanceof BlogException) {
            // 业务异常
            dataObject.put("code", ((BlogException) e).getCode());
            dataObject.put("message", e.getMessage());
        } else {
            // 其他非业务异常
            dataObject.put("code", 500);
            dataObject.put("message", "未知错误，请稍后再试");
            e.printStackTrace();
        }
        return dataObject;
    }

}

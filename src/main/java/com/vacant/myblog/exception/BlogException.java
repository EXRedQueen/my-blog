package com.vacant.myblog.exception;

import java.io.Serializable;

/**
 * @description: 自定义异常类，只有RuntimeException才会进行事务回滚
 * @author: link(dingshengxiao)
 * @date: 2019/5/6 16:08
 */
public class BlogException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = 1L;
    private String message;
    private int code = 500;

    public BlogException(String message) {
        super(message);
        this.message = message;
    }

    public BlogException(String message, Throwable e) {
        super(message, e);
        this.message = message;
    }

    public BlogException(int code, String message) {
        super(message);
        this.message = message;
        this.code = code;
    }

    public BlogException(int code, String message, Throwable e) {
        super(message, e);
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}

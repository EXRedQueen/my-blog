package com.vacant.myblog.common;

import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 返回数据统一JSON格式
 * @author: link(dingshengxiao)
 * @date: 2019/5/6 15:52
 */
public class DataObject extends HashMap<String, Object> {

    private static final long serialVersionUID = 1L;

    public DataObject() {
        put("code", 0);
    }

    public static DataObject  error() {
        return error(HttpStatus.INTERNAL_SERVER_ERROR.value(), "未知错误，请稍后再试");
    }

    public static DataObject error(String message) {
        return error(HttpStatus.INTERNAL_SERVER_ERROR.value(), message);
    }

    public static DataObject error(int code, String message) {
        DataObject dataObject = new DataObject();
        dataObject.put("code", code);
        dataObject.put("message", message);
        return dataObject;
    }

    public static DataObject success() {
        return new DataObject();
    }

    public static DataObject success(String message) {
        DataObject dataObject = new DataObject();
        dataObject.put("message", message);
        return dataObject;
    }

    public static DataObject success(Map<String, Object> map) {
        DataObject dataObject = new DataObject();
        dataObject.putAll(map);
        return dataObject;
    }

    public DataObject put(String key, Object value) {
        super.put(key, value);
        return this;
    }

    public DataObject data(Object value) {
        super.put("data", value);
        return this;
    }

    public static DataObject apiError(String message) {
        return error(1, message);
    }
}

package com.vacant.myblog.entity;

import java.io.Serializable;

/**
 * 博客浏览量表
 *
 * @date 2019-05-06
 */
public class View implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 访问ip
     */
    private String ip;

    /**
     * 创建时间
     */
    private Integer create_by;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Integer getCreate_by() {
        return create_by;
    }

    public void setCreate_by(Integer create_by) {
        this.create_by = create_by;
    }
}
package com.vacant.myblog.entity;

import java.io.Serializable;

/**
 * 博客日志表
 *
 * @date 2019-05-06
 */
public class Log implements Serializable {
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

    /**
     * 操作内容
     */
    private String remark;

    /**
     * 操作地址
     */
    private String operate_url;

    /**
     * 操作的浏览器
     */
    private String operate_by;

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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getOperate_url() {
        return operate_url;
    }

    public void setOperate_url(String operate_url) {
        this.operate_url = operate_url == null ? null : operate_url.trim();
    }

    public String getOperate_by() {
        return operate_by;
    }

    public void setOperate_by(String operate_by) {
        this.operate_by = operate_by == null ? null : operate_by.trim();
    }
}
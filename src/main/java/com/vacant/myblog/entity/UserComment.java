package com.vacant.myblog.entity;

import java.io.Serializable;

/**
 * 用户评论/留言表
 *
 * @date 2019-05-06
 */
public class UserComment implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer user_id;

    /**
     * 用户唯一编码
     */
    private String user_code;

    /**
     * 留言评论内容
     */
    private String content;

    /**
     * 文章id
     */
    private Integer artical_id;

    /**
     * 访问ip
     */
    private String ip;

    /**
     * 创建时间
     */
    private Integer create_by;

    /**
     * 是否有效，1有效 0无效
     */
    private Boolean is_effective;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_code() {
        return user_code;
    }

    public void setUser_code(String user_code) {
        this.user_code = user_code == null ? null : user_code.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getArtical_id() {
        return artical_id;
    }

    public void setArtical_id(Integer artical_id) {
        this.artical_id = artical_id;
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

    public Boolean getIs_effective() {
        return is_effective;
    }

    public void setIs_effective(Boolean is_effective) {
        this.is_effective = is_effective;
    }
}
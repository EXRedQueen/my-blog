package com.vacant.myblog.entity;

import java.io.Serializable;

/**
 * 文章内容表
 *
 * @date 2019-05-06
 */
public class ArticleContent implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 文章id
     */
    private Integer article_id;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 创建时间
     */
    private Integer create_by;

    /**
     * 更新时间
     */
    private Integer modified_by;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getArticle_id() {
        return article_id;
    }

    public void setArticle_id(Integer article_id) {
        this.article_id = article_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getCreate_by() {
        return create_by;
    }

    public void setCreate_by(Integer create_by) {
        this.create_by = create_by;
    }

    public Integer getModified_by() {
        return modified_by;
    }

    public void setModified_by(Integer modified_by) {
        this.modified_by = modified_by;
    }
}
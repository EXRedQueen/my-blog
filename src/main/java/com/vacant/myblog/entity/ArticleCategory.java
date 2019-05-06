package com.vacant.myblog.entity;

import java.io.Serializable;

/**
 * 文章分类关系表
 *
 * @date 2019-05-06
 */
public class ArticleCategory implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 分类id
     */
    private Integer sort_id;

    /**
     * 文章id
     */
    private Integer article_id;

    /**
     * 是否有效，1有效 0无效
     */
    private Boolean is_effective;

    /**
     * 创建时间
     */
    private Integer create_by;

    /**
     * 修改时间
     */
    private Integer modified_by;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSort_id() {
        return sort_id;
    }

    public void setSort_id(Integer sort_id) {
        this.sort_id = sort_id;
    }

    public Integer getArticle_id() {
        return article_id;
    }

    public void setArticle_id(Integer article_id) {
        this.article_id = article_id;
    }

    public Boolean getIs_effective() {
        return is_effective;
    }

    public void setIs_effective(Boolean is_effective) {
        this.is_effective = is_effective;
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
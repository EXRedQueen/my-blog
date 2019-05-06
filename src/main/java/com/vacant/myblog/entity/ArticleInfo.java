package com.vacant.myblog.entity;

import java.io.Serializable;

/**
 * 文章信息表
 *
 * @date 2019-05-06
 */
public class ArticleInfo implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章描述
     */
    private String description;

    /**
     * 是否置顶：1置顶 0不置顶
     */
    private Boolean is_top;

    /**
     * 文章访问量
     */
    private Integer traffic;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Boolean getIs_top() {
        return is_top;
    }

    public void setIs_top(Boolean is_top) {
        this.is_top = is_top;
    }

    public Integer getTraffic() {
        return traffic;
    }

    public void setTraffic(Integer traffic) {
        this.traffic = traffic;
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
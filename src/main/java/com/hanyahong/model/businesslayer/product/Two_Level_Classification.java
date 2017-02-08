package com.hanyahong.model.businesslayer.product;

import org.springframework.data.annotation.Id;

/**
 * Created by hyh on 17-1-10.
 * 二级分类
 */
public class Two_Level_Classification {
    @Id
    private String id;
    private String name;
    private Integer sort;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}

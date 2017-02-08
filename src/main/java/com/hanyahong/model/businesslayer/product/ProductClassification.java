package com.hanyahong.model.businesslayer.product;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hyh on 17-1-10.
 */
public class ProductClassification {
    @Id
    private String id;
    private String name;
    private Integer sort;
    private List<Two_Level_Classification> two_level_classifications = new ArrayList<Two_Level_Classification>();

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

    public List<Two_Level_Classification> getTwo_level_classifications() {
        return two_level_classifications;
    }

    public void setTwo_level_classifications(List<Two_Level_Classification> two_level_classifications) {
        this.two_level_classifications = two_level_classifications;
    }
}

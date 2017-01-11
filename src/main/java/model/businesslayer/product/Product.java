package model.businesslayer.product;

import org.springframework.data.annotation.Id;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hyh on 17-1-10.
 * 产品信息
 */
public class Product {
    //基本属性
    @Id
    private String id;
    private String name;
    private String specifications;//规格
    private String brand;//品牌
    private String unit;//单位
    private Map<String, String> other_attribute = new HashMap<String, String>();
    //系统控制-外关联
    private String uid;
    private String classification;
    private String two_level_classification;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getTwo_level_classification() {
        return two_level_classification;
    }

    public void setTwo_level_classification(String two_level_classification) {
        this.two_level_classification = two_level_classification;
    }

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

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Map<String, String> getOther_attribute() {
        return other_attribute;
    }

    public void setOther_attribute(Map<String, String> other_attribute) {
        this.other_attribute = other_attribute;
    }
}

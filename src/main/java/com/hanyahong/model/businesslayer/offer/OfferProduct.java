package com.hanyahong.model.businesslayer.offer;

import org.springframework.data.annotation.Id;

/**
 * Created by hyh on 17-1-11.
 * <p>
 * 报价单里产品详情
 */
public class OfferProduct {
    @Id
    private String id;
    private String name;
    private String brand_specifications;//品牌+规格
    private String unit;//单位
    private double unitprice;//单价
    private Integer number;//数量
    private String remark;//备注


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

    public String getBrand_specifications() {
        return brand_specifications;
    }

    public void setBrand_specifications(String brand_specifications) {
        this.brand_specifications = brand_specifications;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

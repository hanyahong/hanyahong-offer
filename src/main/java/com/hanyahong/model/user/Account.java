package com.hanyahong.model.user;

/**
 * Created by Administrator on 2017/1/22.
 * 账户信息实体类
 */
public class Account {
    //账户
    private Boolean vip = false;
    private Integer vip_grade = 0;
    private Double account;

    public Boolean getVip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }

    public Integer getVip_grade() {
        return vip_grade;
    }

    public void setVip_grade(Integer vip_grade) {
        this.vip_grade = vip_grade;
    }

    public Double getAccount() {
        return account;
    }

    public void setAccount(Double account) {
        this.account = account;
    }
}

package com.hanyahong.model;

/**
 * Created by Administrator on 2017/2/9.
 * 状态信息
 */
public class StatusInfo {
    private String id;
    private String status;
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

/*
 * Copyright (c) 2017.版权所有
 */

package com.hanyahong.util;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yx on 2016/12/6.
 */
public class IpInfoUtil {
    String addr;
    private HttpResponse response;

    public String getIpAddress(String ip) {
        String host = "https://dm-81.data.aliyun.com";
        String path = "/rest/160601/ip/getIpInfo.json";
        String method = "GET";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE db834abf4fe74955b0dbb2adee8efa6a");
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("ip", ip);
        try {
            response = HttpUtils.doGet(host, path, method, headers, querys);
            addr = EntityUtils.toString(response.getEntity());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return addr;
    }

}
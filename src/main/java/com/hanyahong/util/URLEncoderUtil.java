/*
 * Copyright (c) 2017.版权所有
 */

package com.hanyahong.util;

import org.apache.commons.lang.StringUtils;

import java.net.URLEncoder;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by hyh on 16-12-30.
 * 编码工具类
 *
 * @author hyh
 */
public class URLEncoderUtil {

    /**
     * map键值对URL编码
     *
     * @param maps
     * @return
     * @throws Exception
     */
    public static String connectStringURL(Map<String, String> maps) throws Exception {
        StringBuilder keys = new StringBuilder();
        for (Map.Entry<String, String> map : maps.entrySet()) {
            if (0 < keys.length()) {
                keys.append("&");
            }
            if (StringUtils.isBlank(map.getKey()) && !StringUtils.isBlank(map.getValue())) {
                keys.append(map.getValue());
            }
            if (!StringUtils.isBlank(map.getKey())) {
                keys.append(map.getKey());
                if (!StringUtils.isBlank(map.getValue())) {
                    keys.append("=").append(map.getValue());
                }
            }
        }
        return keys.toString();
    }

    public static TreeMap<String, String> mapURlEncoder(TreeMap<String, String> maps) throws Exception {

        for (Map.Entry<String, String> map : maps.entrySet()) {
            if (!StringUtils.isBlank(map.getKey())) {
                if (!StringUtils.isBlank(map.getValue())) {
                    map.setValue(URLEncoder.encode(map.getValue(), "utf-8"));
                }
            }
        }
        return maps;
    }
}

/*
 * Copyright (c) 2017.版权所有
 */

package com.hanyahong.component;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * token控制
 *
 * @author hyh
 * @see org.springframework.web.servlet.AsyncHandlerInterceptor
 * @since 1.8
 */

@Component
public class AccessTokenVerifyInterceptor extends HandlerInterceptorAdapter {
    private static final Logger LOG = LoggerFactory.getLogger(AccessTokenVerifyInterceptor.class);

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", " OPTIONS,GET, POST, PUT, DELETE, HEAD");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Expose-Headers", "token");
        response.setHeader("Expires", "-1");
        response.setHeader("Cache-Control", "no-cache");
        response.setHeader("pragma", "no-cache");
        response.setHeader("Content-Disposition", "attachment");
        response.setHeader("Access-Control-Allow-Headers", "token,Origin, No-Cache, x-requested-with,version,phonemodel,operatesystem" +
                "Content-Disposition,content-type, " + "If-Modified-Since, Pragma, Last-Modified," +
                " Cache-Control, Expires, X-E4M-With");

        boolean flag = false;

        String accessToken = request.getHeader("token");

        if (StringUtils.isNotBlank(accessToken)) {
           // UserAccount u = this.userRepoImpl.selUserByToken(accessToken);
            if (accessToken != null) {
                flag = true;
            }
        }
        if (!flag) {
            response.setStatus(403);
            response.setHeader("token", "token expired");
            response.getWriter().print("Token ERROR");
        }

        return flag;
    }


}

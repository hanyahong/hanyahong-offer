/*
 * Copyright (c) 2017.版权所有
 */

package com.hanyahong.configuration;

import com.hanyahong.component.AccessTokenVerifyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 注册拦截器配置类
 *
 * @author hyh
 * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    @Bean
    public AccessTokenVerifyInterceptor tokenVerifyInterceptor() {

        return new AccessTokenVerifyInterceptor();
    }

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(tokenVerifyInterceptor()).addPathPatterns("/client/**");
        super.addInterceptors(registry);
    }


}


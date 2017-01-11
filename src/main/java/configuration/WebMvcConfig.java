/*
 * Copyright (c) 2017.版权所有
 */

package configuration;

import cc.zhanyun.component.AccessTokenVerifyInterceptor;
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
        registry.addInterceptor(tokenVerifyInterceptor()).addPathPatterns("/clientone/**");
        registry.addInterceptor(tokenVerifyInterceptor()).addPathPatterns("/projectoffer/**");
        registry.addInterceptor(tokenVerifyInterceptor()).addPathPatterns("/project/**");
        registry.addInterceptor(tokenVerifyInterceptor()).addPathPatterns("/offer/**");
        registry.addInterceptor(tokenVerifyInterceptor()).addPathPatterns("/resources/**");
        registry.addInterceptor(tokenVerifyInterceptor()).addPathPatterns("/location/**");
        registry.addInterceptor(tokenVerifyInterceptor()).addPathPatterns("/file/**");
        registry.addInterceptor(tokenVerifyInterceptor()).addPathPatterns("/user/**");
        registry.addInterceptor(tokenVerifyInterceptor()).addPathPatterns("/company/**");
        registry.addInterceptor(tokenVerifyInterceptor()).addPathPatterns("/taskoffer/**");
        registry.addInterceptor(tokenVerifyInterceptor()).addPathPatterns("/auth/**");
        registry.addInterceptor(tokenVerifyInterceptor()).addPathPatterns("/inquiry/**");
        registry.addInterceptor(tokenVerifyInterceptor()).addPathPatterns("/presources/type/**");
        registry.addInterceptor(tokenVerifyInterceptor()).addPathPatterns("/plocation/**");
        registry.addInterceptor(tokenVerifyInterceptor()).addPathPatterns("/presources/**");
        registry.addInterceptor(tokenVerifyInterceptor()).addPathPatterns("/plocation/**");
        registry.addInterceptor(tokenVerifyInterceptor()).addPathPatterns("/permission/**");
        registry.addInterceptor(tokenVerifyInterceptor()).addPathPatterns("/permission/**");
        super.addInterceptors(registry);
    }


}


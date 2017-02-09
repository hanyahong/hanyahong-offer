package com.hanyahong;/*
 * Copyright (c) 2017.版权所有
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 程序入口
 *
 * @author hyh
 * @since JDK1.8
 */
@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = {"com.hanyahong"})
public class Application {


    /**
     * 主函数-主入口
     *
     * @param args
     * @throws Exception
     */
    // 主函数
    public static void main(String[] args) throws Exception {
        new SpringApplication(new Object[]{Application.class}).run(args);
    }

    /**
     * 跨域访问设置
     *
     * @return
     */
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowCredentials(Boolean.valueOf(true));
        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedMethod("*");
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**",
                corsConfiguration);

        return new CorsFilter(urlBasedCorsConfigurationSource);
    }

}

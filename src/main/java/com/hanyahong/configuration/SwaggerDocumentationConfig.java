/*
 * Copyright (c) 2017.版权所有
 */

package com.hanyahong.configuration;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.embedded.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.MultipartConfigElement;

/**
 * swagger控制
 *
 * @author hyh
 */
@Configuration
@EnableSwagger2
public class SwaggerDocumentationConfig {
    @Value("${security.userOauth.clientId}")
    private String authClientId;
    @Value("${security.userOauth.clientSecret}")
    private String authClientSecret;
    @Value("${security.userOauth.type}")
    private String type;
    @Value("${security.userOauth.authorizationUrl}")
    private String authorizationUrl;
    @Value("${security.userOauth.tokenUrl}")
    private String tokenUrl;
    @Value("${security.userOauth.tokenName}")
    private String tokenName;
    @Value("${security.userOauth.scope.code}")
    private String scopeCode;
    @Value("${security.userOauth.scope.desc}")
    private String scopeDesc;
    @Value("${app.key}")
    private String appKey;
    @Value("${app.name}")
    private String appName;
    @Value("${app.desc}")
    private String appDesc;
    @Value("${app.version}")
    private String appVersion;
    @Value("${app.termsOfServiceUrl}")
    private String termsOfServiceUrl;
    @Value("${app.contact.name}")
    private String contactName;
    @Value("${app.contact.url}")
    private String contactUrl;
    @Value("${app.contact.email}")
    private String contactEmail;
    @Value("${app.license}")
    private String license;
    @Value("${app.licenseUrl}")
    private String licenseUrl;

    private String chag(String result) {
        String c = null;
        try {
            c = new String(result.getBytes("ISO-8859-1"), "utf-8");
        } catch (Exception e) {
        }
        return c;
    }

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(chag(appName))
                .description(chag(appDesc))
                .license(chag(license))
                .licenseUrl(chag(licenseUrl))
                .termsOfServiceUrl(chag(termsOfServiceUrl))
                .version(chag(appVersion))
                .contact(new Contact(chag(contactName), chag(contactUrl), chag(contactEmail)))
                .build();
    }


    /**
     * @return
     */
    @Bean
    public Docket customImplementation() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.hanyahong.api"))
                .build().apiInfo(apiInfo());
    }

    /**
     * 文件大小控制
     *
     * @return
     */
    @Bean
    public MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize("20480KB");
        factory.setMaxRequestSize("20480KB");
        return factory.createMultipartConfig();
    }


}


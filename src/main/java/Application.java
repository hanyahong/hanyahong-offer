/*
 * Copyright (c) 2017.版权所有
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.MultipartConfigElement;

/**
 * 程序入口
 *
 * @author hyh
 * @since JDK1.8
 */
@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = {"cc.zhanyun"})
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

    /**
     * 文件大小限制
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

/*
    @Bean
    public EmbeddedServletContainerFactory servletContainer() {
        TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory() {
            @Override
            protected void postProcessContext(org.apache.catalina.Context context) {
                SecurityConstraint constraint = new SecurityConstraint();
                constraint.setUserConstraint("CONFIDENTIAL");
                SecurityCollection collection = new SecurityCollection();
                collection.addPattern("/public");
                collection.addPattern("/auth");
                constraint.addCollection(collection);
                context.addConstraint(constraint);

            }
        };
        tomcat.addAdditionalTomcatConnectors(httpConnector());
        return tomcat;
    }

    @Bean
    public Connector httpConnector() {
        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
        connector.setScheme("http");
        //Connector监听的http的端口号
        connector.setPort(8094);
        connector.setSecure(false);
        //监听到http的端口号后转向到的https的端口号
        connector.setRedirectPort(8443);
        return connector;
    }*/
}

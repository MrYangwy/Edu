package com.yang.edu.util.corscofig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author : MrYang
 * @Date : 2019-10-22 21:25
 * @Description : 添加对跨域访问的支持
 */
@Configuration
public class GlobalCorsConfig {
    @Bean
    public WebMvcConfigurer corsConfigurer(){
        // 重写父类提供的跨域请求处理的接口
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                // 添加映射路径
                registry.addMapping("/**")
                        // 放行哪些原始域
                        .allowedOrigins("*")
                        // 放行哪些请求方式
                        .allowedMethods("*")
                        // 是否允许携带 cookie
                        .allowCredentials(true)
                        // 放行哪些头部信息
                        .allowedHeaders("*");
            }
        };
    }
}

package com.blog.config;

import com.blog.interceptor.LoginInterceptor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author 蔡梓阳
 * @Date 2022/3/15 22:34
 */
@Configuration
@ComponentScan(basePackages = "com.blog")
public class WebMvcConfig implements WebMvcConfigurer {

    /**
     * 注册自定义的登录拦截器
     * @param registry 拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/admin/**")
                .excludePathPatterns("/admin")
                .excludePathPatterns("/admin/login");
    }
}

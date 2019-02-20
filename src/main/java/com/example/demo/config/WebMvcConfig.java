package com.example.demo.config;

import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 配置静态资源映射
 **/
@Component
public class WebMvcConfig implements WebMvcConfigurer {
    /**
     * 设置默认首页
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {



    }

    /**
     * 添加静态资源文件，外部可以直接访问地址
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");

    }}

package com.echo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        //设置 / 和 /index.html 路径 跳转到index视图，首页的跳转最好在这里设置
//        registry.addViewController("/").setViewName("index_football");
//        registry.addViewController("/index.html").setViewName("index_football");
//    }
}

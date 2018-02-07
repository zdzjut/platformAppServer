package com.boot.druid.setting;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class WebAppConfig extends WebMvcConfigurerAdapter {
    //获取配置文件中图片的路径
    @Value("${show.picturePath}")
    private String picturePath;

    //资源映射
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //url没有变化
        registry.addResourceHandler("/images/**").addResourceLocations(picturePath);
        super.addResourceHandlers(registry);
    }
}
package com.example.dataserviceplatform.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 * Author:js
 * Date:2019/
 */
//    @Configuration
//    @EnableWebMvc
public class cors implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").
                allowedOriginPatterns("*")
                .allowedHeaders("*")
                .allowedMethods("POST","GET","PUT")
                .allowCredentials(true).maxAge(3600);
    }
}

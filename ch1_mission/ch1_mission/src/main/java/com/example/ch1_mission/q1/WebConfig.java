package com.example.ch1_mission.q1;

import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors (InterceptorRegistry registry){
        registry.addInterceptor(new LoginCheckInterceptor())
                .addPathPatterns("/board/**", "/mypage")
                .excludePathPatterns("/", "/login");
    }
}

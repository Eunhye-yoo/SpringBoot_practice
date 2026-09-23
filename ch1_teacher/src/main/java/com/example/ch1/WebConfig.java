package com.example.ch1;

import com.example.ch1.aop.Interceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    private final Interceptor interceptor;

    public WebConfig(Interceptor interceptor) {
        this.interceptor = interceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor)
        .addPathPatterns("/**") // 모든 url경로에 인터셉터 적용
                .excludePathPatterns("/css/**", "/js/**", "/images/**"); // 정적 리소스 등은 제외
    }
}

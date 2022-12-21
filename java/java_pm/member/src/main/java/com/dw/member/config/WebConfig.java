package com.dw.member.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// Config: 설정 || Web Config: 웹 설정
// @Configuration
public class WebConfig implements WebMvcConfigurer{
    @Autowired
    Interceptor interceptor;    // 만들어둔 Interceptor 파일 불러오기
    
    // addInterciptors: 인터셉터를 추가하는 함수를 재정의
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String[] patterns = {"/login", "/error", "/resources/static/*", "/api/v1/login"};    // 인터셉터 제외 url
        registry.addInterceptor(interceptor).excludePathPatterns(patterns);
    }
}

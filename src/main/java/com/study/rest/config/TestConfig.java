package com.study.rest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.expression.TypedValue;

@Configuration
public class TestConfig {

    // 라이브러리의 객체를 IoC에 등록(메소드의 리턴값이 등록됨)
    @Bean
    public TypedValue typedValue() {
        return new TypedValue(null);
    }
}

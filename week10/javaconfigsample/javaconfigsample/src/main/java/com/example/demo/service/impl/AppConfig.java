package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.service.BusinessLogic;
import com.example.demo.service.impl.SampleLogicImpl;
import com.example.demo.service.impl.TestLogicImpl;

@Configuration
public class AppConfig {
    @Bean("test")
    public BusinessLogic testLogic() {
        return new TestLogicImpl();
    }
    @Bean("sample")
    public BusinessLogic sampleLogic() {
        return new SampleLogicImpl();
    }
}

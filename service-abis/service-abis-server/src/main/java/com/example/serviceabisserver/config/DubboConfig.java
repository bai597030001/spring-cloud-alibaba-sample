package com.example.serviceabisserver.config;

import com.example.serviceabisapi.service.AbisService;
import org.apache.dubbo.config.spring.ReferenceBean;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDubbo
public class DubboConfig {
    @Bean
    ReferenceBean<AbisService> referenceBean() {
        // 注册一个ReferenceBean<GreetingService>类型的普通bean
        ReferenceBean<AbisService> referenceBean = new ReferenceBean<>();
        referenceBean.setId("greetingService");
        referenceBean.setInterface(AbisService.class);
        referenceBean.setVersion("1.0.0");
        return referenceBean;
    }

    @Bean
    AbisService greetingService() {
        // 注册一个GreetingService类型的普通bean
        return (AbisService) referenceBean().getObject();
    }
}

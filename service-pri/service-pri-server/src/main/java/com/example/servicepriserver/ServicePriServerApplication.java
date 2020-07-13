package com.example.servicepriserver;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServicePriServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicePriServerApplication.class, args);
    }
}

package com.example.serviceabisserver.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    @Value("${useLocalCache}")
    private int useLocalCache;

    @RequestMapping("/get")
    @SentinelResource(value = "get")
    public String get() {
        return String.valueOf(useLocalCache);
    }
}

package com.example.serviceabisserver.service;

import com.example.serviceabisapi.service.AbisService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0", weight = 100)
public class AbisServiceImpl implements AbisService {
    @Override
    public String getAbis(int start, int end) {
        return "this is spring cloud alibaba dubbo abis api";
    }
}

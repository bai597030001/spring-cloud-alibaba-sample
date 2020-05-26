package com.example.servicepriserver.service;

import com.example.servicepriapi.PriService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0", weight = 100)
public class PriServiceImpl implements PriService {
    @Override
    public String getPri(int start, int end) {
        return "this is spring cloud alibaba dubbo pri api";
    }
}

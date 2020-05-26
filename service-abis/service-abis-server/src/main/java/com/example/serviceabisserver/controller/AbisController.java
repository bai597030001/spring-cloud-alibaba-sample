package com.example.serviceabisserver.controller;

import com.example.serviceabisapi.service.AbisService;
import com.example.servicepriapi.PriService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(allowCredentials = "true")
public class AbisController {
    @Autowired
    private AbisService abisService;

    @Reference(version = "1.0.0", loadbalance = "roundrobin", cluster = "failfast")
    private PriService priService;

    @GetMapping("abis")
    public String getAbisData(){
        return abisService.getAbis(1, 10);
    }

    @GetMapping("pri")
    public String getPriData(){
        return priService.getPri(1, 10);
    }
}

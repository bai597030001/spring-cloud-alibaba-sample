package com.example.servicepriserver.controller;

import com.example.serviceabisapi.service.AbisService;
import com.example.servicepriapi.PriService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(allowCredentials = "true")
public class PriController {

    @Autowired
    private PriService priService;

    @Reference(version = "1.0.0", loadbalance = "roundrobin", cluster = "failfast")
    private AbisService abisService;

    @GetMapping("pri")
    public String getPriData(){
        return priService.getPri(1, 10);
    }

    @GetMapping("abis")
    public String getAbisData(){
        return abisService.getAbis(1, 10);
    }
}

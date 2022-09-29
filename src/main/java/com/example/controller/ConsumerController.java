package com.example.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.DemoService;

@RestController
public class ConsumerController {
    @DubboReference
    DemoService demoService;

    @GetMapping("/test")
    public String sayHello(){
        return demoService.sayHello("cqy");
    }
}

package com.example.springbootconditionalonpropertydemo.controller;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@ConditionalOnProperty(name = "code.version", havingValue = "prod")
@RestController
public class HelloController {


    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}

package com.example.springbootconditionalonpropertydemo.controller;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@ConditionalOnProperty(name = "code.version", havingValue = "test")
@RestController
public class TestHelloController {


    @GetMapping("/hello")
    public String testHello() {
        return "Hello Test World!";
    }
}

package com.iblog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value="/test")
    public String testCase(){
        return "Hello world!";
    }
}

package com.example.SpringBootproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculate {

@RequestMapping("/addey")
    public String addtion(){
        int a=5;
        int b=8;
        int sum=a+b;
        return "printing tow value:"+sum;

    }
}

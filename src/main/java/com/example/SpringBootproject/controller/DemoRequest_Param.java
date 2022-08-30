package com.example.SpringBootproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRequest_Param {

    @RequestMapping("/message")
    public String demoReuest(@RequestParam String mess){  //RequestParam  /message?vaMessage="Test Message"

        return mess+" this value was called from UI";
    }

    @RequestMapping("/int_mess")
    public String demo(@RequestParam int int_valur){
        return int_valur+"this value was entered from UI";
    }
}

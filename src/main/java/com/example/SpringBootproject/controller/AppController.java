package com.example.SpringBootproject.controller;


import com.example.SpringBootproject.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AppController {
    @Autowired  AppService appService;


    @RequestMapping(value = "/app", method = RequestMethod.GET)
    public String message(){
       // AppService obj =new AppService();
       // return "Response From Controller Layer";
       return appService.servicemethod();
    }
    @GetMapping("/try")
    public String mess(){
        return appService.servicemethod();
    }

}

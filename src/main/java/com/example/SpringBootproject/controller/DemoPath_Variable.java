package com.example.SpringBootproject.controller;

import com.example.SpringBootproject.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoPath_Variable {
    List<Employee>  employeeList = new  ArrayList<Employee>();

   @RequestMapping("/greeting/{message}") // path_variable /greeting/Hello spring Boot
    public String greeting(@PathVariable String message){
    String greeting = "path_varible value excepted"+message;

return greeting;
    }

   /* @RequestMapping("/greet2/{int no }") // path_variable /greet/138746
    public String greet2(@PathVariable int int_var) {
        String greet2 = "path_varible value excepted" + int_var;

        return greet2;

    }*/

    }

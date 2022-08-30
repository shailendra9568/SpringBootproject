package com.example.SpringBootproject.controller;

import com.example.SpringBootproject.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ClientInfoStatus;
import java.util.*;

@RestController
public class DemoController {
    List<String> list = new ArrayList<>(); // create Globle Variable
    List<Employee> list_emp =new ArrayList<>(); //  create Globle Variable
     @RequestMapping("/Demo")
    // create method
    public void demo(){
        System.out.println(" this is demo method");
    }
    @RequestMapping("/Demo1")
    public String demo1(){
         return "demo statement return uri";
    }

    @RequestMapping("/demo2")
    public String demo3(){
      //  List<String> list = new ArrayList<>(); // create a list object of string type
         list.add("java Developer");
         System.out.println("List....>" +list);
         return "Returning list ";
    }

    @RequestMapping("/emp")
    public  List<Employee> empDemo(){
        Employee employee =new Employee("jaykaran", 30, "IIT");
        list_emp.add(employee);
        Employee employee1=new Employee("vibhav",26,"IIT");
        list_emp.add(employee1);
       // System.out.println("employee name is:"+employee.getName()+"age is "+employee.getAge()+"dept is:"+employee.getDept());
        return list_emp;
    }

}

package com.example.SpringBootproject.controller;

import com.example.SpringBootproject.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class ControllerWithadd_Remv {
    List<Employee> employeeList =new ArrayList<Employee>();

    @RequestMapping("/ad_emp") // need to add element
    public String addemp(){
        Employee employee=new Employee("virat",28,"css");
        employeeList.add(employee);

        return "successfully added"+employee.getName();
    }
    // Display all employee       CRUD OPERATION
     @RequestMapping("/employee_disply")
    public  List<Employee> disall(){

        return employeeList ;
    }
    // need remove
    @RequestMapping("/remove")
    public String remove_emp(){
        employeeList.remove(0);
        return "success fully remove employeeList"+employeeList.get(0).getName();
    }
    // Update Record
   @RequestMapping("/UPDATE")
    public String upDate(){
        Employee employee  =  employeeList.get(0);
        employee.setName("Gabru");
        employeeList.add(employee);

        return "success fully UpDate Records"+employee.getName();

    }




}

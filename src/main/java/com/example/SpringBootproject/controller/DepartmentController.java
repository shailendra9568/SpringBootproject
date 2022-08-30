package com.example.SpringBootproject.controller;

import com.example.SpringBootproject.entity.Department;
import com.example.SpringBootproject.service.DepartmentService;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
 //@XSlf4j
@RequestMapping("/department")

public class DepartmentController {
    @Autowired
    private DepartmentService departmentService; //  create object of service class

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
       // log.info(" inside savedepartment method of deprtment");
        return departmentService.saveDepatment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id")  Long departmentId) {
       // long.info("inside finddepartmentById method of department");
        return departmentService.findDepartmentById(departmentId);

    }

}


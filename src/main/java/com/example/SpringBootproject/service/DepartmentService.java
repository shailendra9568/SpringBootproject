package com.example.SpringBootproject.service;


import com.example.SpringBootproject.entity.Department;
import com.example.SpringBootproject.repository.DepartmentRepository;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@XSlf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository; // create object Repository class

    public Department saveDepatment(Department department) {
        return departmentRepository.save(department);

    }

    public Department findDepartmentById(Long departmentId) {
       // log.info("inside savedepartment of departmentService ");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}


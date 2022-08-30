package com.example.SpringBootproject.service;


import com.example.SpringBootproject.repository.AppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService {
    @Autowired
    AppRepository appRepository;

    public String servicemethod(){
       //return "Response from service layer ";
       return appRepository.repoRepository();
    }
}

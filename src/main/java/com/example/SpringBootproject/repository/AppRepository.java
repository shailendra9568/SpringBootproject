package com.example.SpringBootproject.repository;

import org.springframework.stereotype.Repository;

@Repository
public class AppRepository {
    public String repoRepository(){
        return "Response from Repository layer";
    }
}

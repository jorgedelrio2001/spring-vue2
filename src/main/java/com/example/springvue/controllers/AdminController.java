package com.example.springvue.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    //need to call admin service

    //Dependency Injection
    @Autowired
    public AdminController(){
        return;
    }
}

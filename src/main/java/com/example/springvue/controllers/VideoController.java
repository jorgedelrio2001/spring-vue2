package com.example.springvue.controllers;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@Scope("singleton")
/*@RequestMapping() REQUEST MAPPING allows you to change your root directory name from being plain "/"
 without interfering with the other settings*/
public class VideoController {

    @GetMapping("/video-page")
    public String index(HttpServletRequest request) {
        System.out.print("PROTEINNNN");
        return "windex";
    }
   /* @GetMapping
    public String waddup(){
        return "waddup b";
    }*/
 }

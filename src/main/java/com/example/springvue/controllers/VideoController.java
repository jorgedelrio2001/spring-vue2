package com.example.springvue.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
/*@RequestMapping() REQUEST MAPPING allows you to change your root directory name from being plain "/"
 without interfering with the other settings*/
public class VideoController {

    @GetMapping("/video-page")
    public String index(HttpServletRequest request) {
        return "video";
    }
 }

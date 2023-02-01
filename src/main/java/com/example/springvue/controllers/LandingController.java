package com.example.springvue.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
/*@RequestMapping() REQUEST MAPPING allows you to change your root directory name from being plain "/"
 without interfering with the other settings*/
public class LandingController {

    @GetMapping("/welcome")
    public String index(HttpServletRequest request) {
        return "welcome";
    }
}
package com.example.springvue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringVueApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringVueApplication.class, args);

    }

    /*
     * Used to run on external server.
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringVueApplication.class);
    }

}
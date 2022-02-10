package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestContorller {
    @RequestMapping(value = "/mas/mainbord")
    public String test(){
        return "thymeleaf/mas/mainbord.html";
    }

}

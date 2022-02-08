package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestContorller {
    @RequestMapping(value = "/test")
    public String test(){
        return "test";
    }

}

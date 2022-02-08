package com.example.mas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping(name="")
    public String mainboard(){
        return "";
    }
}

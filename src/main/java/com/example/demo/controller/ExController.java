package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExController {

    @RequestMapping(value = "/home")
    public String home(){
         return "index.html";
    }


    @RequestMapping(value = "/thymeleafHome")
    public String thymeleafHome(Model model){
        model.addAttribute("name", "thymeleaf");
        return "thymeleaf/thymeleafTest.html";
    }

}

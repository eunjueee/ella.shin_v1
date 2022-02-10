package com.example.mas.controller;

import com.example.mas.vo.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/mas")
public class MainController {
    @RequestMapping(value="/main")
    public String mainboard(Model model){
        Resource resource = new Resource();
        initailResource(resource);
        model.addAttribute("resource", resource);
        return  "thymeleaf/mas/mainMas.html";
    }

    private void initailResource(Resource resource){
        resource.setGeneration(0);
        resource.setO2(0);
        resource.setOcean(0);
        resource.setTemp(-30);
    }
}

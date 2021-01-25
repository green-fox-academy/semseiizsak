package com.greenfox.printer.controller;

import com.greenfox.printer.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsefulController {

    UtilityService utilityService;

    @Autowired
    public UsefulController(UtilityService utilityService){
        this.utilityService = utilityService;
    }

    @GetMapping("/")
    public String main(){
        return "main";
    }


    @GetMapping("/useful/colored")
    public String index(Model model){
        model.addAttribute("randomColor", utilityService.randomColor());
        return "index";
    }


}

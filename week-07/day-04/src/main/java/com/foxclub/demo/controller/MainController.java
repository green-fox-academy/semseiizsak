package com.foxclub.demo.controller;

import com.foxclub.demo.model.enums.Drink;
import com.foxclub.demo.model.enums.Food;
import com.foxclub.demo.model.foxModel;
import com.foxclub.demo.service.InfoService;
import com.sun.tools.javac.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.naming.Name;

@Controller
public class MainController {

    foxModel foxModel;

    @Autowired
    InfoService infoService;

    @Autowired
    public MainController(InfoService infoService){
        this.infoService = infoService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    //later should add curseword list to default
    @GetMapping("/login")
    public String login(@RequestParam(value = "name", required = false, defaultValue = "fuck") String name, Model model){
        if (name.contains("fuck")){
            return "login";
        } else {
            foxModel = new foxModel(name);
            model.addAttribute("foxModel", foxModel);
            return "user";
        }
    }

    @GetMapping("/register")
    public String register(@RequestParam(value = "name", required = false, defaultValue = "fuck") String name, Model model){
        if (name.contains("fuck")){
            return "register";
        } else {
            foxModel = new foxModel(name);
            model.addAttribute("foxModel", foxModel);
            return "user";
        }
    }


    @PostMapping("/user")
    public String user(String name, Model model){
        model.addAttribute("name", name);
        model.addAttribute("foodList", infoService.getFoodList());
        model.addAttribute("drinkList", infoService.getDrinkList());
        return "user";
    }

}

package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.model.Hellos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldLiterally {

    @RequestMapping("/randomhello")
    public String randomHelloFunction(Hellos hellos, Model model, @RequestParam String fontColor, @RequestParam Integer fontSize) {

        model.addAttribute("randomHello", hellos.getRandomHello());
        model.addAttribute("fontColor", fontColor);
        model.addAttribute("fontSize", fontSize);

        return "internationalhellos";
    }
}

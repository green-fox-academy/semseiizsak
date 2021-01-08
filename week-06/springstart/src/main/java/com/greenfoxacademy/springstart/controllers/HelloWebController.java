package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

    AtomicLong atomicLong = new AtomicLong();

    @RequestMapping("/web/greeting")
    public String greeting(Model model, @RequestParam String name) {
        model.addAttribute("name", name);
        Greeting greeting = new Greeting(atomicLong.getAndIncrement(), "name");
        model.addAttribute("id", greeting.getId());
        return "greeting";
    }
}

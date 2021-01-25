package com.example.reddit.controller;

import com.example.reddit.model.User;
import com.example.reddit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/registration")
    public String userRegistrationPage() {
        return "registrationpage";
    }

    @PostMapping("/registration")
    public String userRegistrationSubmit(@ModelAttribute User user) {
        userService.addUser(user);
        return "/login";
    }

    @GetMapping("/login")
    public String userLoginPage() {
        return "loginpage";
    }

    @PostMapping("/login")
    public String userLoginSubmit(@ModelAttribute User user) {
        userService.userLogin(user.getName());
        return "redirect:/hottest";
    }
}

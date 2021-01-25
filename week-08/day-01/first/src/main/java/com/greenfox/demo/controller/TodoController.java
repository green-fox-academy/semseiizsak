package com.greenfox.demo.controller;

import com.greenfox.demo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {

    public TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    @GetMapping(value = {"/", "/lsit"})
    public String index(Model model) {
        model.addAttribute("todos", todoRepository.findAll());
        return "index";
    }

   /* @RequestMapping(value = {"/", "/list"}, method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("todos", todoRepository.findAll());
        return "index";
    } */


    @GetMapping ("/todo")
    public String todo (){
        return "redirect:/";
    }
}

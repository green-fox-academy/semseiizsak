package com.example.demo.controller;

import com.example.demo.model.Todo;
import com.example.demo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("/")
    public String test(Model model){
        List<Todo> todoList = (List<Todo>) todoRepository.findAll();
        model.addAttribute("todos", todoList);
        return "index";
    }


    @RequestMapping(value = { "/list"}, method = RequestMethod.GET)
    public String list(Model model, @RequestParam(required = false) Boolean isActive) {
        List<Todo> todoList = (List<Todo>) todoRepository.findAll();
        if (isActive == null) {
            model.addAttribute("todos", todoRepository.findAll());
        } else {

            model.addAttribute("todos",
                    todoList.stream()
                            .filter(t -> t.getDone() != isActive)
                            .collect(Collectors.toList()));
        }
        return "index";

    }

    @GetMapping("/add")
    public String getAddPage(){
        return "add";
    }

    @PostMapping("/add")
    public String AddTodo(String title ){
        todoRepository.save(new Todo(title));
        return "redirect:/todo/list";
    }

    @GetMapping("/{id}/delete")
    public String deleteById(@PathVariable Long id){
        todoRepository.deleteById(id);
        return "redirect:/todo/list";
    }

   

}
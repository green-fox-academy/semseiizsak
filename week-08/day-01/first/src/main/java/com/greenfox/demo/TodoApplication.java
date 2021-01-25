package com.greenfox.demo;

import com.greenfox.demo.model.Todo;
import com.greenfox.demo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

    TodoRepository todoRepository;

    @Autowired
    public TodoApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
        todoRepository.save(new Todo("Suck your mom command line"));
        todoRepository.save(new Todo("Find that sucker who made H2 a thing"));
    }
}

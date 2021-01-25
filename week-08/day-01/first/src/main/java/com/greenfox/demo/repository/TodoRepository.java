package com.greenfox.demo.repository;

import com.greenfox.demo.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository <Todo, Long> {
}

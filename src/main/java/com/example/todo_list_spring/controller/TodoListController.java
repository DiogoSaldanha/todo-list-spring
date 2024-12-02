package com.example.todo_list_spring.controller;

import com.example.todo_list_spring.model.Task;
import com.example.todo_list_spring.service.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TodoListController {

    @Autowired
    private TodoListService todoListService;

    @GetMapping
    public List<Task> getTasks() {
        return todoListService.getTasks();
    }

    @PostMapping
    public void addTask(@RequestBody Task task) {
        todoListService.addTask(task.getDescription());
    }

    @DeleteMapping("/{index}")
    public void deleteTask(@PathVariable int index) {
        todoListService.deleteTask(index);
    }

    @PutMapping("/{index}")
    public void markTaskAsCompleted(@PathVariable int index) {
        todoListService.markTaskAsCompleted(index);
    }
}
package com.example.dztotal.controller;

import com.example.dztotal.Servise.Servise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    private final Servise service;

    @Autowired
    public Controller(Servise service) {
        this.service = service;
    }

    @GetMapping("/tasks")
    public List<Task> getAllTasks() {
        return service.getAllTasks();
    }

    @PostMapping("/tasks")
    public void createTask(@RequestBody Task task) {
        service.addTask(task);
    }
}

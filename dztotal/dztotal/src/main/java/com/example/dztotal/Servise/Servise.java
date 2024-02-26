package com.example.dztotal.Servise;

import org.springframework.scheduling.config.Task;

import java.util.List;

public interface Servise {
    List<Task> getAllTasks();

    Task createTask(Task task);

    Task getTaskById(Long id);

    Task updateTask(Long id, Task task);

    void deleteTask(Long id);

    void addTask(Task task);
}

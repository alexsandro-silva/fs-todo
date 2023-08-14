package com.arsilva.fstodobackend.service;

import com.arsilva.fstodobackend.models.Task;
import com.arsilva.fstodobackend.resource.dto.TaskDto;

import java.util.List;

public interface TaskService {
    Task addTask(TaskDto taskDto);
    Task updateTask(TaskDto taskDto);
    void deleteTask(Long id);
    Task findById(Long id);
    Task completeTask(Long id);
}

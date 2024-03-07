package org.talent.toDoList.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.talent.toDoList.dto.NewCategoryRequest;
import org.talent.toDoList.dto.NewTaskRequest;
import org.talent.toDoList.entity.Category;
import org.talent.toDoList.entity.Task;
import org.talent.toDoList.service.CategoryService;
import org.talent.toDoList.service.TaskService;
import org.talent.toDoList.utitlity.HttpResponse;

import java.util.List;

import static org.talent.toDoList.utitlity.HttpResponse.createResponse;

@RestController
@CrossOrigin
public class TaskController {
    @Autowired
    private TaskService taskService;



    @PostMapping("/tasks")
    public ResponseEntity<HttpResponse<Task>> saveNewTask(@RequestBody NewTaskRequest request){
       Task task=taskService.saveNewTask(request);

        return createResponse(task, HttpStatus.CREATED);
    }

    @GetMapping("/tasks")
    public  ResponseEntity<HttpResponse<List<Task>>> getTask() {
        List<Task> tasksList =taskService.findAll();
        return createResponse(tasksList, HttpStatus.OK);
    }
}

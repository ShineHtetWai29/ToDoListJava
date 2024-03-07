package org.talent.toDoList.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.talent.toDoList.dto.NewCategoryRequest;
import org.talent.toDoList.entity.Category;
import org.talent.toDoList.service.CategoryService;
import org.talent.toDoList.utitlity.HttpResponse;

import java.util.List;

import static org.talent.toDoList.utitlity.HttpResponse.createResponse;

@RestController
@CrossOrigin
public class CategoryController {
    @Autowired
    private CategoryService categoryService;



    @PostMapping("/categories")
    public ResponseEntity<HttpResponse<Category>> saveNewCategory(@RequestBody NewCategoryRequest request){
       Category category=categoryService.saveNewCategory(request);

        return createResponse(category, HttpStatus.CREATED);
    }

    @GetMapping("/categories")
    public  ResponseEntity<HttpResponse<List<Category>>> getCategory() {
        List<Category> categoryList =categoryService.findAll();
        return createResponse(categoryList, HttpStatus.OK);
    }
}

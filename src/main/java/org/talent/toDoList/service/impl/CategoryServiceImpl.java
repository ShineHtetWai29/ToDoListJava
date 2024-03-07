package org.talent.toDoList.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.talent.toDoList.dto.NewCategoryRequest;
import org.talent.toDoList.entity.Category;
import org.talent.toDoList.repo.CategoryRepo;
import org.talent.toDoList.service.CategoryService;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepo categoryRepo;


    @Autowired
    private ModelMapper modelMapper;
    @Override
    public Category saveNewCategory(NewCategoryRequest request) {
        Category category=modelMapper.map(request,Category.class);


       return categoryRepo.save(category);
    }

    @Override
    public List<Category> findAll() {
        return categoryRepo.findAll();
    }
}

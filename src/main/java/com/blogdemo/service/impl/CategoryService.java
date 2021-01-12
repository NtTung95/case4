package com.blogdemo.service.impl;


import com.blogdemo.model.entities.Category;
import com.blogdemo.repository.CategoryRepository;
import com.blogdemo.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Iterable<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> findOne(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Optional<Category> remove(Long id) {
        Optional<Category> category = categoryRepository.findById(id);
        categoryRepository.deleteById(id);
        return category;
    }
}

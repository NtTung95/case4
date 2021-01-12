package com.blogdemo.service;

import com.blogdemo.model.entities.Category;

import java.util.Optional;

public interface ICategoryService {
    Iterable<Category> findAll();

    Optional<Category> findOne(Long id);

    Category save(Category category);

    Optional<Category> remove(Long id);
}

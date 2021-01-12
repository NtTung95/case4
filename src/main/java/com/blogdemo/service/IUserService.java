package com.blogdemo.service;

import com.blogdemo.model.entities.Post;
import com.blogdemo.model.entities.User;

import java.util.Optional;

public interface IUserService {
    Iterable<User> findAll();

    Optional<User> findOne(Long id);

    User save(User user);

    Optional<User> remove(Long id);
}

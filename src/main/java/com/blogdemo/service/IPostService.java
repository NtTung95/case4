package com.blogdemo.service;

import com.blogdemo.model.entities.Post;

import java.util.Optional;

public interface IPostService {
    Iterable<Post> findAll();

    Optional<Post> findOne(Long id);

    Post save(Post post);

    Optional<Post> remove(Long id);
}

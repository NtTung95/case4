package com.blogdemo.service.impl;

import com.blogdemo.model.entities.Post;
import com.blogdemo.service.IPostService;
import com.blogdemo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService implements IPostService {
    @Autowired
    private PostRepository postRepository;

    @Override
    public Iterable<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public Optional<Post> findOne(Long id) {
        return postRepository.findById(id);
    }


    @Override
    public Post save(Post post) {
        return postRepository.save(post);
    }

    @Override
    public Optional<Post> remove(Long id) {
        Optional<Post> post = postRepository.findById(id);
        postRepository.deleteById(id);
        return post;
    }
}

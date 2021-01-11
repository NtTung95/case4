package com.blogdemo.repository;

import com.blogdemo.model.entities.Post;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


public interface PostRepository extends PagingAndSortingRepository<Post,Long> {
    Post findAllByTitle(String title);
}

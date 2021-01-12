package com.blogdemo.repository;

import com.blogdemo.model.entities.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {
}

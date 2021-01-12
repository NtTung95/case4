package com.blogdemo.service.impl;

import com.blogdemo.model.entities.User;
import com.blogdemo.repository.UserRepository;
import com.blogdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findOne(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> remove(Long id) {
        Optional<User> user = userRepository.findById(id);
        userRepository.deleteById(id);
        return user;
    }
}

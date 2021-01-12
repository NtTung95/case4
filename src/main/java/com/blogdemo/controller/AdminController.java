package com.blogdemo.controller;

import com.blogdemo.model.entities.Post;
import com.blogdemo.service.impl.CategoryService;
import com.blogdemo.service.impl.PostService;
import com.blogdemo.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private UserService userService;
    @Autowired
    private PostService postService;
    @Autowired
    private CategoryService categoryService;


    @GetMapping("/post")
    public ModelAndView postManage(){
        ModelAndView modelAndView = new ModelAndView("admin/postManage");
        modelAndView.addObject("posts", postService.findAll());
        return modelAndView;
    }

    @GetMapping("/user")
    public ModelAndView userManage(){
        ModelAndView modelAndView = new ModelAndView("admin/userManage");
        modelAndView.addObject("users", userService.findAll());
        return modelAndView;
    }
}

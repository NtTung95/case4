package com.blogdemo.controller;

import com.blogdemo.model.entities.Category;
import com.blogdemo.model.entities.Post;
import com.blogdemo.service.impl.CategoryService;
import com.blogdemo.service.impl.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @Autowired
    private PostService postService;

    @Autowired
    private CategoryService categoryService;

    @ModelAttribute("categories")
    public Iterable<Category> categories(){
        return categoryService.findAll();
    }

    @GetMapping
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("home");
        Iterable<Post> posts = postService.findAll();
        modelAndView.addObject("posts", posts);
        return modelAndView;
    }
}

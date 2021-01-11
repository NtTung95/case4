package com.blogdemo.controller;

import com.blogdemo.model.entities.Post;
import com.blogdemo.model.entities.Response;
import com.blogdemo.service.IPostService;
import com.blogdemo.service.impl.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @Autowired
    private IPostService postService;

    @GetMapping("/home")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("home");
        Iterable<Post> posts = postService.findAll();
        modelAndView.addObject("posts", posts);
        return modelAndView;
    }

}

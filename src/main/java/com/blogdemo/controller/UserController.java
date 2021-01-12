package com.blogdemo.controller;


import com.blogdemo.model.entities.Response;
import com.blogdemo.service.impl.PostService;
import com.blogdemo.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private PostService postService;

    private Response res = new Response();


    @GetMapping("/profile")
    public ModelAndView profile(){
        return new ModelAndView("userProfile");
    }


    @GetMapping
    public Response getAll(){
        res.setData(userService.findAll());
        return res;
    }
}

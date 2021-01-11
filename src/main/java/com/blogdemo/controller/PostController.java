package com.blogdemo.controller;

import com.blogdemo.model.entities.Post;
import com.blogdemo.model.entities.Response;
import com.blogdemo.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/admin")
public class PostController {
    @Autowired
    private IPostService postService;
    private Response res = new Response();


    @GetMapping("/home")
    public ModelAndView home(){
        return new ModelAndView("home");
    }


    //RES

    @GetMapping
    public Response index(){
        Iterable<Post> posts = postService.findAll();
        res.data = posts;
        res.message = "success";
        res.status = res.SUCCESS;
        return res;
    }

    @GetMapping("/{id}")
    public Response findOne(@PathVariable Long id){
        res.data = postService.findOne(id);
        res.message = "success";
        res.status = res.SUCCESS;
        return res;
    }

    @PostMapping
    public Response save(@RequestBody Post post){
        res.data = postService.save(post);
        res.message = "success";
        res.status = res.SUCCESS;
        return res;
    }

    @DeleteMapping
    public Response delete(@PathVariable Long id){
        res.data = postService.remove(id);
        res.message = "success";
        res.status = res.SUCCESS;
        return res;
    }
}

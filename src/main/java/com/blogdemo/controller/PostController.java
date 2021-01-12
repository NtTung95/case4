package com.blogdemo.controller;

import com.blogdemo.model.entities.Post;
import com.blogdemo.model.entities.Response;
import com.blogdemo.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("post")
@CrossOrigin("*")
public class PostController {
    @Autowired
    private IPostService postService;
    private Response res = new Response();


    @GetMapping("/home")
    public ModelAndView home(){
        return new ModelAndView("home");
    }

    @GetMapping("/createPost")
    public ModelAndView createPost(){
        ModelAndView modelAndView = new ModelAndView("newPost");
        modelAndView.addObject("post",new Post());
        return modelAndView;
    }


    //RES
    @GetMapping
    public Response index(){
        Iterable<Post> posts = postService.findAll();
        res.setData(posts);
        res.setMessage("success");
        res.setStatus(res.SUCCESS);
        return res;
    }

    @GetMapping("/{id}")
    public Response findOne(@PathVariable Long id){
        res.setData(postService.findOne(id));
        res.setMessage("success");
        res.setStatus(res.SUCCESS);
        return res;
    }

    @PostMapping
    public Response save(@RequestBody Post post){
        res.setData(postService.save(post));
        res.setMessage("success");
        res.setStatus(res.SUCCESS);
        return res;
    }

    @DeleteMapping(value = "{id}")
    public Response delete(@PathVariable Long id){
        res.setData(postService.remove(id));
        res.setMessage("success");
        res.setStatus(res.SUCCESS);
        return res;
    }
}

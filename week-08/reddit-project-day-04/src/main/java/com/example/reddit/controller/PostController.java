package com.example.reddit.controller;

import com.example.reddit.model.Post;
import com.example.reddit.model.User;
import com.example.reddit.repo.PostRepo;
import com.example.reddit.service.PostService;
import com.example.reddit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class PostController {

    private PostService postService;
    private UserService userService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String hottestPage(Model model) {
        List<Post> postList = postService.postListFindAll();
        model.addAttribute("postList", postList);
        return "decide";
    }

    @GetMapping("/add")
    public String getSubmitPage() {
        return "submit-post";
    }

    @PostMapping("/add")
    public String addNewPost(@ModelAttribute Post post){
        postService.createNewPost(post.getTitle(), post.getDescription());
        return "redirect:/hottest";
    }

    @GetMapping("/upvote/{id}")
    public String upvote(@PathVariable Long id){
        Optional<Post> optionalPost = postService.findById(id);
        if (optionalPost.isPresent()){
            postService.upvote(optionalPost);
        }
        return "redirect:/hottest";
    }

    @GetMapping("/downvote/{id}")
    public String downvote(@PathVariable Long id){
        Optional<Post> optionalPost = postService.findById(id);
        if (optionalPost.isPresent()){
            postService.downvote(optionalPost);
        }
        return "redirect:/hottest";
    }

    @GetMapping("/delete/{id}")
    public String deleteById(@PathVariable Long id){
        Optional<Post> optionalPost = postService.findById(id);
        postService.deleteById(optionalPost);
        return "redirect:/hottest";
    }

    @GetMapping("/description/{id}")
    public String postDescription(@PathVariable Long id, Model model){
        Optional<Post> optionalPost = postService.findById(id);

        model.addAttribute("title", postService.getById(id).getTitle());
        model.addAttribute("description", postService.getById(id).getDescription());
        return "redirect:/hottest";
    }

    @GetMapping("/home")
    public String withoutRegistrationPage(Model model) {
        List<Post> postList = postService.postListFindAll();
        model.addAttribute("postList", postList);
        return "home";
    }

    @GetMapping("/hottest")
    public String withUserPage(Model model, @ModelAttribute User user) {
        List<Post> postList = postService.postListFindAll();
        model.addAttribute("postList", postList);
        return "hottest";
    }
}


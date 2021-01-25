package com.example.reddit.service;

import com.example.reddit.model.Post;
import com.example.reddit.repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    private PostRepo postRepo;

    @Autowired
    public PostService(PostRepo postRepo){
        this.postRepo = postRepo;
    }

    public void addPost(Post post) {
        postRepo.save(post);
    }

    public List<Post> postListFindAll() {
        return (List<Post>) postRepo.findAll();
    }

    public void createNewPost(String title, String description){
        postRepo.save(new Post(title, description));
    }

    public Optional<Post> findById(Long id){
        return postRepo.findById(id);
    }

    public Post getById(Long id) {
        return postRepo.findById(id).orElse(null);
    }

    public void upvote(Optional<Post> post){
        post.ifPresent(vc -> vc.setUpvoteCount(vc.getUpvoteCount() + 1));
        postRepo.save(post.get());
    }

    public void downvote(Optional<Post> post){
        post.ifPresent(vc -> vc.setUpvoteCount(vc.getUpvoteCount() - 1));
        postRepo.save(post.get());
    }

    public void deleteById(Optional<Post> post){
        post.ifPresent(del -> del.getId());
        postRepo.delete(post.get());
    }

    public void sendDescription(Optional<Post> post){
        post.ifPresent(s -> s.getId());
        postRepo.save(post.get()).toString();
    }
}

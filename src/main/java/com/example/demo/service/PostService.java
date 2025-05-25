package com.example.demo.service;

import com.example.demo.model.Post;
import com.example.demo.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostRepository repo;

    public PostService(PostRepository repo) {
        this.repo = repo;
    }

    public List<Post> listAllPosts() {
        return repo.findAll();
    }

    public void create(String text) {
        Post p = new Post(text);
        repo.save(p);
    }
}

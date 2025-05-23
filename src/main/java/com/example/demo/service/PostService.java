package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        return List.of(
                new Post("Первый пост о Java"),
                new Post("Второй пост о Spring"),
                new Post("Третий пост о Bean")
        );
    }
}

package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    private final List<Post> posts = new ArrayList<>();
//    public List<Post> listAllPosts() {
//        return List.of(
//                new Post("Первый пост о Java"),
//                new Post("Второй пост о Spring"),
//                new Post("Третий пост о Bean")
//        );
//    }
    {
        posts.add(new Post("Первый пост о Java"));
        posts.add(new Post("Второй пост о Spring"));
        posts.add(new Post("Третий пост о Bean"));
    }
    public List<Post> listAllPosts() {
        return posts;
    }
    public void create(String text) {
        posts.add(new Post(text));
    }
}

package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    private final List<Post> posts = new ArrayList<>();

    {
        posts.add(new Post(0L, "Первый пост о Java"));
        posts.add(new Post(1L, "Второй пост о Spring"));
        posts.add(new Post(2L, "Третий пост о Bean"));
    }

    public List<Post> listAllPosts() {
        return posts;
    }
    public void create(String text) {
        Long newId = (long) posts.size();
        posts.add(new Post(newId, text));
    }
}

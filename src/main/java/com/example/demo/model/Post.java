package com.example.demo.model;

import java.util.Date;
import java.util.List;

public class Post {
    private final Long id;
    private String text;
    private Date creationDate;
    private Integer likes;

    public Post(Long id, String text){
        this.id = id;
        this.text = text;
        this.creationDate = new Date();
        this.likes = 0;
    }
    public String getText() {
        return text;
    }
    public Date getCreationDate() {
        return creationDate;
    }
    public Integer getLikes() {
        return likes;
    }
    public void setLikes(Integer likes) {
        this.likes = likes;
    }
    public Long getId() {
        return id;
    }
}

package com.example.demo.model;

import java.util.Date;
import java.util.List;

public class Post {
    private String text;
    private Date creationDate;
    private Integer likes;

    public Post(String text){
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
}

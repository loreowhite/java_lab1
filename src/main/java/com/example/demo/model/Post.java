package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    private Date creationDate;
    private Integer likes;

    public Post() {

    }

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
    public void setLikes(Integer likes) {
        this.likes = likes;
    }
    public Long getId() {
        return id;
    }
}

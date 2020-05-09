package com.example.demoweb.model;

import java.util.Date;

public class Post {

    private String text;
    private Integer likes = 0;
    private Date creationDate;

    public Post() {
    }

    public Post(Long id, String text, Date creationDate) {
        this.text = text;
        this.creationDate = creationDate;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }
}

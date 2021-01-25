package com.example.reddit.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;


@Entity
@Table(name = "reddit")
public class Post{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Integer upvoteCount = 0;
    private Timestamp timestamp;

    public Post(String title, String description){
        this.title = title;
        this.description = description;
    }


    public Integer getUpvoteCount() {
        return upvoteCount;
    }

    public void setUpvoteCount(Integer upvoteCount) {
        this.upvoteCount = upvoteCount;
    }

    public Post(Long id, String title, String description, Integer upvoteCount, Timestamp timestamp) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.upvoteCount = upvoteCount;
        this.timestamp = timestamp;
    }

    public Post() {
        Date date = new Date();
        this.timestamp = new Timestamp(date.getTime());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
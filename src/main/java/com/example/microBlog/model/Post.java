package com.example.microBlog.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long post_id;
    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private User user;
    @NotBlank
    private String post_body;
    @Temporal(TemporalType.TIMESTAMP)
    private Date post_timeStamp;
}

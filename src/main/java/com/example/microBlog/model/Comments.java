package com.example.microBlog.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Comments {
    @Id
    @GeneratedValue
    private long comment_id;
    @ManyToOne
    private Post post_id;
    @ManyToOne
    private User user_id;
    @Temporal(TemporalType.TIMESTAMP)
    private String comment_body;
}

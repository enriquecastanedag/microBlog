package com.example.microBlog.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Followers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long follower_id;
    @ManyToOne
    private User follower;

    @ManyToOne
    private User follows;
    @Temporal(TemporalType.TIMESTAMP)
    private Date follower_timeStamp;
}

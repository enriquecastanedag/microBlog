package com.example.microBlog.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.util.Date;

@Data
@Entity
public class Reactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long reaction_id;
    @ManyToOne
    private Post post_id;
    @ManyToOne
    private User user_id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date reaction_timeStamp;
}

package com.example.microBlog.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long user_id;
    @NotBlank
    private String user_name;
    @NotBlank
    private String user_email;
    @Temporal(TemporalType.TIMESTAMP)
    private Data user_timeStamp;
}

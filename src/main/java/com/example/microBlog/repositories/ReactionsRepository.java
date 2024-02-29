package com.example.microBlog.repositories;

import com.example.microBlog.model.Reactions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReactionsRepository extends JpaRepository<Reactions,Long> {
}

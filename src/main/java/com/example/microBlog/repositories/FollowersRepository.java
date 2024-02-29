package com.example.microBlog.repositories;

import com.example.microBlog.model.Followers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FollowersRepository extends JpaRepository<Followers,Long> {
}

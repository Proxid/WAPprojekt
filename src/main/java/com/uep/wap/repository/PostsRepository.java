package com.uep.wap.repository;

import com.uep.wap.model.Post;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Post, Integer> {
}

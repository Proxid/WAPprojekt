package com.uep.wap.repository;

import com.uep.wap.model.Comment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepository extends JpaRepository<Comment, Integer> {
    Comment findByName(String name);
}

package com.uep.wap.repository;

import com.uep.wap.model.Like;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LikesRepository extends JpaRepository<Like, Integer> {
}

package com.uep.wap.repository;

import com.uep.wap.model.Tag;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TagsRepository extends JpaRepository<Tag, Integer> {
    Tag findByName(String name);
}

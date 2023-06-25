package com.uep.wap.repository;

import com.uep.wap.model.User;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface UsersRepository extends PagingAndSortingRepository<User, Integer> {
}

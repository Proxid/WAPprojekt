package com.uep.wap.repository;

import com.uep.wap.model.DailySummary;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DailySummariesRepository extends JpaRepository<DailySummary, Integer> {
}

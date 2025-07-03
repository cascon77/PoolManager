package com.example.PoolManager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PoolManager.entitys.Pool;

@Repository
public interface PoolRepository extends JpaRepository<Pool, Long> {

	
}

package com.example.PoolManager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PoolManager.entitys.ResolutionStep;

@Repository
public interface ResolutionStepRepository extends JpaRepository<ResolutionStep, Long> {


}

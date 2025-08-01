package com.example.PoolManager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PoolManager.entitys.ResolutionStepEntity;

@Repository
public interface ResolutionStepRepository extends JpaRepository<ResolutionStepEntity, Long> {


}

package com.example.PoolManager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PoolManager.entitys.WaterParams;

@Repository
public interface WaterParamsRepository extends JpaRepository<WaterParams, Long> {


}

package com.example.PoolManager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PoolManager.entitys.MaintenanceRecordEntity;

@Repository
public interface MaintenanceRecordRepository extends JpaRepository<MaintenanceRecordEntity, Long> {
	

}

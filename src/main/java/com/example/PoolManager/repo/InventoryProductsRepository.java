package com.example.PoolManager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PoolManager.entitys.InventoryProductsEntity;

@Repository
public interface InventoryProductsRepository extends JpaRepository<InventoryProductsEntity, Long> {

	
}

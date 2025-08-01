package com.example.PoolManager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PoolManager.entitys.ProductEntity;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {


}

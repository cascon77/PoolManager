package com.example.PoolManager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PoolManager.entitys.CommonIssueEntity;

@Repository
public interface CommonIssueRepository extends JpaRepository<CommonIssueEntity, Long> {
	

}

package com.example.PoolManager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.PoolManager.entitys.CommonIssueHasResolutionStepEntity;

@Repository
public interface CommonIssueHasResolutionStepRepository extends JpaRepository<CommonIssueHasResolutionStepEntity, Long> {

}

package com.example.PoolManager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommonIssueHasResolutionStep extends JpaRepository<CommonIssueHasResolutionStep, Long> {

}

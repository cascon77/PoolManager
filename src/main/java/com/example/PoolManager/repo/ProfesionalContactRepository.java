package com.example.PoolManager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PoolManager.entitys.ProfesionalContact;

@Repository
public interface ProfesionalContactRepository extends JpaRepository<ProfesionalContact, Long> {

	
}

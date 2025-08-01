package com.example.PoolManager.entitys;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "maintenance_records")
public class MaintenanceRecordEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Enumerated(EnumType.STRING)
	private MaintenanceType type;

	private LocalDate Date;
	private String observations;

	@Enumerated(EnumType.STRING)
	private MaintenanceStatus status;

	@ManyToOne
	@JoinTable(name = "MaintenanceRecord_pool")
	private PoolEntity pool;

	@ManyToOne
	@JoinTable(name = "MaintenanceRecord_user")
	private UserEntity user;

	@ManyToOne
	@JoinColumn(name = "common_issue_id")
	private CommonIssueEntity commonIssue;
}

package com.example.PoolManager.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "common_issue_has_resolution_step")
public class CommonIssueHasResolutionStep {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "common_issue_id")
	private CommonIssue commonIssue;
	
	@ManyToOne
	@JoinColumn(name = "resolution_step_id")
	private ResolutionStep resolutionStep;
	
	private int stepOrder;
}

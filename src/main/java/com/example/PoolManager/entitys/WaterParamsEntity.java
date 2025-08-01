package com.example.PoolManager.entitys;

import java.time.LocalDate;

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
@Table(name = "water_parameters")
public class WaterParamsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate date;
	private Double ph;
	private Double chlorine;
	private Double temperature;
	private Double salinity;
	private String observations;
	
	@ManyToOne
	@JoinColumn(name = "pool_id", nullable = false)
	private PoolEntity pool;
}

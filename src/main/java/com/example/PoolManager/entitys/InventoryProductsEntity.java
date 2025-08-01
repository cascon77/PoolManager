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
@Table(name = "inventory_products")
public class InventoryProductsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private ProductEntity product;
	
	private int quantity;
	private LocalDate DateBought;
	private LocalDate fechaVencimiento;
	
	@ManyToOne
	@JoinColumn(name = "pool_id")
	private PoolEntity pool;
	
	private String note;
}

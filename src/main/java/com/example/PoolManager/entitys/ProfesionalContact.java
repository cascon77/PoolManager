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
@Table(name = "profesional_contacts")
public class ProfesionalContact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String email;
	private String phone;
	private String address;
	private String webUrl;
	
	@ManyToOne
	@JoinColumn(name = "service_type_id")
	private ServiceType serviceType;
	
	@ManyToOne
	@JoinColumn(name = "pool_id")
	private Pool pool;
	
}

package com.el.implantacao.domain.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@Entity
public class Client {
		
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@OneToOne
	private Address idAdress;
	
	@NotBlank
	@Size(max = 5)
	private Boolean isActive;
	
//	@ManyToMany
//	@JoinTable(
//		name = "Checklist",
//		joinColumns = @JoinColumn(name = "idClient"),
//		inverseJoinColumns = @JoinColumn(name = "idTask")
//	)
//	private List<Task> tasks;
}

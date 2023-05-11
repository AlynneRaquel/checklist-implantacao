package com.el.implantacao.api.controller;

import java.util.List;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.el.implantacao.domain.model.Status;
import com.el.implantacao.domain.repository.StatusRepository;


@AllArgsConstructor
@RestController
@RequestMapping("/statuses")
public class StatusController {
	
	@Autowired
	private StatusRepository statusRepository;
//	private CatalogoStatusService catalogoStatusService;

	@GetMapping
	public List<Status> listar() {
		return statusRepository.findAll();
	}
	
//	@GetMapping("/{StatusId}")
//	public ResponseEntity<Status> buscar(@PathVariable Long StatusId) {
//		return StatusRepository.findById(StatusId)
//				.map(ResponseEntity::ok)
//				.orElse(ResponseEntity.notFound().build());
//		
//	}
//
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Status adicionar(@Valid @RequestBody Status Status) {
		return statusRepository.save(Status);
	}
//	
//	@PutMapping("/{StatusId}")
//	public ResponseEntity<Status> atualizar(@PathVariable Long StatusId, @Valid @RequestBody Status Status) {
//		if (!StatusRepository.existsById(StatusId)) {
//			return ResponseEntity.notFound().build();
//		}
//		
//		Status.setId(StatusId);
//		Status = catalogoStatusService.salvar(Status);
//		
//		return ResponseEntity.ok(Status);
//	}
//	
	@DeleteMapping("/{StatusId}")
	public ResponseEntity<Void> remover(@PathVariable Long StatusId) {
		if (!statusRepository.existsById(StatusId)) {
			return ResponseEntity.notFound().build();
		}
		
		statusRepository.deleteById(StatusId);
//		catalogoStatusService.excluir(StatusId);
		
		return ResponseEntity.noContent().build();
	}
	
}

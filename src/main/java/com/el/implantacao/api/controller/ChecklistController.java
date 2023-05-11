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

import com.el.implantacao.domain.model.Checklist;
import com.el.implantacao.domain.repository.ChecklistRepository;


@AllArgsConstructor
@RestController
@RequestMapping("/checklists")
public class ChecklistController {
	
	@Autowired
	private ChecklistRepository checklistRepository;
//	private CatalogoChecklistService catalogoChecklistService;

	@GetMapping
	public List<Checklist> listar() {
		return checklistRepository.findAll();
	}
	
//	@GetMapping("/{ChecklistId}")
//	public ResponseEntity<Checklist> buscar(@PathVariable Long ChecklistId) {
//		return ChecklistRepository.findById(ChecklistId)
//				.map(ResponseEntity::ok)
//				.orElse(ResponseEntity.notFound().build());
//		
//	}
//
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Checklist adicionar(@Valid @RequestBody Checklist Checklist) {
		return checklistRepository.save(Checklist);
	}
//	
//	@PutMapping("/{ChecklistId}")
//	public ResponseEntity<Checklist> atualizar(@PathVariable Long ChecklistId, @Valid @RequestBody Checklist Checklist) {
//		if (!ChecklistRepository.existsById(ChecklistId)) {
//			return ResponseEntity.notFound().build();
//		}
//		
//		Checklist.setId(ChecklistId);
//		Checklist = catalogoChecklistService.salvar(Checklist);
//		
//		return ResponseEntity.ok(Checklist);
//	}
//	
//	@DeleteMapping("/{ChecklistId}")
//	public ResponseEntity<Void> remover(@PathVariable Long ChecklistId) {
//		if (!ChecklistRepository.existsById(ChecklistId)) {
//			return ResponseEntity.notFound().build();
//		}
//		
////		ChecklistRepository.deleteById(ChecklistId);
//		catalogoChecklistService.excluir(ChecklistId);
//		
//		return ResponseEntity.noContent().build();
//	}
	
}

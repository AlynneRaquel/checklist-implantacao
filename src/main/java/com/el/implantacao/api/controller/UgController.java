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

import com.el.implantacao.domain.model.Ug;
import com.el.implantacao.domain.repository.UgRepository;


@AllArgsConstructor
@RestController
@RequestMapping("/ugs")
public class UgController {
	
	@Autowired
	private UgRepository ugRepository;
//	private CatalogoUgService catalogoUgService;

	@GetMapping
	public List<Ug> listar() {
		return ugRepository.findAll();
	}
	
//	@GetMapping("/{UgId}")
//	public ResponseEntity<Ug> buscar(@PathVariable Long UgId) {
//		return UgRepository.findById(UgId)
//				.map(ResponseEntity::ok)
//				.orElse(ResponseEntity.notFound().build());
//		
//	}
//
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Ug adicionar(@Valid @RequestBody Ug Ug) {
		return ugRepository.save(Ug);
	}
//	
//	@PutMapping("/{UgId}")
//	public ResponseEntity<Ug> atualizar(@PathVariable Long UgId, @Valid @RequestBody Ug Ug) {
//		if (!UgRepository.existsById(UgId)) {
//			return ResponseEntity.notFound().build();
//		}
//		
//		Ug.setId(UgId);
//		Ug = catalogoUgService.salvar(Ug);
//		
//		return ResponseEntity.ok(Ug);
//	}
//	
//	@DeleteMapping("/{UgId}")
//	public ResponseEntity<Void> remover(@PathVariable Long UgId) {
//		if (!UgRepository.existsById(UgId)) {
//			return ResponseEntity.notFound().build();
//		}
//		
////		UgRepository.deleteById(UgId);
//		catalogoUgService.excluir(UgId);
//		
//		return ResponseEntity.noContent().build();
//	}
	
}

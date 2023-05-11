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

import com.el.implantacao.domain.model.Type;
import com.el.implantacao.domain.repository.TypeRepository;


@AllArgsConstructor
@RestController
@RequestMapping("/types")
public class TypeController {
	
	@Autowired
	private TypeRepository typeRepository;
//	private CatalogoTypeService catalogoTypeService;

	@GetMapping
	public List<Type> listar() {
		return typeRepository.findAll();
	}
	
//	@GetMapping("/{TypeId}")
//	public ResponseEntity<Type> buscar(@PathVariable Long TypeId) {
//		return TypeRepository.findById(TypeId)
//				.map(ResponseEntity::ok)
//				.orElse(ResponseEntity.notFound().build());
//		
//	}
//
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Type adicionar(@Valid @RequestBody Type Type) {
		return typeRepository.save(Type);
	}
//	
//	@PutMapping("/{TypeId}")
//	public ResponseEntity<Type> atualizar(@PathVariable Long TypeId, @Valid @RequestBody Type Type) {
//		if (!TypeRepository.existsById(TypeId)) {
//			return ResponseEntity.notFound().build();
//		}
//		
//		Type.setId(TypeId);
//		Type = catalogoTypeService.salvar(Type);
//		
//		return ResponseEntity.ok(Type);
//	}
//	
//	@DeleteMapping("/{TypeId}")
//	public ResponseEntity<Void> remover(@PathVariable Long TypeId) {
//		if (!TypeRepository.existsById(TypeId)) {
//			return ResponseEntity.notFound().build();
//		}
//		
////		TypeRepository.deleteById(TypeId);
//		catalogoTypeService.excluir(TypeId);
//		
//		return ResponseEntity.noContent().build();
//	}
	
}

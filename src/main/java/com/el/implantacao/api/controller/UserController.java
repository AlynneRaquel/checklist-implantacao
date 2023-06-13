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

import com.el.implantacao.domain.model.User;
import com.el.implantacao.domain.repository.UserRepository;


@AllArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
//	private CatalogoUserService catalogoUserService;

	@GetMapping
	public List<User> listar() {
		return userRepository.findAll();
	}
	
//	@GetMapping("/{UserId}")
//	public ResponseEntity<User> buscar(@PathVariable Long UserId) {
//		return UserRepository.findById(UserId)
//				.map(ResponseEntity::ok)
//				.orElse(ResponseEntity.notFound().build());
//		
//	}
//
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public User adicionar(@Valid @RequestBody User User) {
		return userRepository.save(User);
	}
//	
//	@PutMapping("/{UserId}")
//	public ResponseEntity<User> atualizar(@PathVariable Long UserId, @Valid @RequestBody User User) {
//		if (!UserRepository.existsById(UserId)) {
//			return ResponseEntity.notFound().build();
//		}
//		
//		User.setId(UserId);
//		User = catalogoUserService.salvar(User);
//		
//		return ResponseEntity.ok(User);
//	}
//	
//	@DeleteMapping("/{UserId}")
//	public ResponseEntity<Void> remover(@PathVariable Long UserId) {
//		if (!UserRepository.existsById(UserId)) {
//			return ResponseEntity.notFound().build();
//		}
//		
////		UserRepository.deleteById(UserId);
//		catalogoUserService.excluir(UserId);
//		
//		return ResponseEntity.noContent().build();
//	}
	
}

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

import com.el.implantacao.domain.model.Task;
import com.el.implantacao.domain.repository.TaskRepository;


@AllArgsConstructor
@RestController
@RequestMapping("/tasks")
public class TaskController {
	
	@Autowired
	private TaskRepository taskRepository;
//	private CatalogoTaskService catalogoTaskService;

	@GetMapping
	public List<Task> listar() {
		return taskRepository.findAll();
	}
	
//	@GetMapping("/{TaskId}")
//	public ResponseEntity<Task> buscar(@PathVariable Long TaskId) {
//		return TaskRepository.findById(TaskId)
//				.map(ResponseEntity::ok)
//				.orElse(ResponseEntity.notFound().build());
//		
//	}
//
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Task adicionar(@Valid @RequestBody Task Task) {
		return taskRepository.save(Task);
	}
//	
//	@PutMapping("/{TaskId}")
//	public ResponseEntity<Task> atualizar(@PathVariable Long TaskId, @Valid @RequestBody Task Task) {
//		if (!TaskRepository.existsById(TaskId)) {
//			return ResponseEntity.notFound().build();
//		}
//		
//		Task.setId(TaskId);
//		Task = catalogoTaskService.salvar(Task);
//		
//		return ResponseEntity.ok(Task);
//	}
//	
//	@DeleteMapping("/{TaskId}")
//	public ResponseEntity<Void> remover(@PathVariable Long TaskId) {
//		if (!TaskRepository.existsById(TaskId)) {
//			return ResponseEntity.notFound().build();
//		}
//		
////		TaskRepository.deleteById(TaskId);
//		catalogoTaskService.excluir(TaskId);
//		
//		return ResponseEntity.noContent().build();
//	}
	
}

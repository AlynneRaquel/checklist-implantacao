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

import com.el.implantacao.domain.model.Address;
import com.el.implantacao.domain.repository.AddressRepository;


@AllArgsConstructor
@RestController
@RequestMapping("/addresses")
public class AddressController {
	
	@Autowired
	private AddressRepository addressRepository;
//	private CatalogoClientService catalogoClientService;

	@GetMapping
	public List<Address> listar() {
		return addressRepository.findAll();
	}
	
//	@GetMapping("/{ClientId}")
//	public ResponseEntity<Client> buscar(@PathVariable Long ClientId) {
//		return ClientRepository.findById(ClientId)
//				.map(ResponseEntity::ok)
//				.orElse(ResponseEntity.notFound().build());
//		
//	}
//
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Address adicionar(@Valid @RequestBody Address address) {
		return addressRepository.save(address);
	}
//	
//	@PutMapping("/{ClientId}")
//	public ResponseEntity<Client> atualizar(@PathVariable Long ClientId, @Valid @RequestBody Client Client) {
//		if (!ClientRepository.existsById(ClientId)) {
//			return ResponseEntity.notFound().build();
//		}
//		
//		Client.setId(ClientId);
//		Client = catalogoClientService.salvar(Client);
//		
//		return ResponseEntity.ok(Client);
//	}
//	
//	@DeleteMapping("/{ClientId}")
//	public ResponseEntity<Void> remover(@PathVariable Long ClientId) {
//		if (!ClientRepository.existsById(ClientId)) {
//			return ResponseEntity.notFound().build();
//		}
//		
////		ClientRepository.deleteById(ClientId);
//		catalogoClientService.excluir(ClientId);
//		
//		return ResponseEntity.noContent().build();
//	}
	
}

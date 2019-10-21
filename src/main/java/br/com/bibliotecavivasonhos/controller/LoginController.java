package br.com.bibliotecavivasonhos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bibliotecavivasonhos.entities.Login;
import br.com.bibliotecavivasonhos.repository.LoginRepository;

@RestController
public class LoginController {

	@Autowired
	private LoginRepository repository;
	
	@PostMapping("/login/register")
	public ResponseEntity<Login> cadastrar() {
		Login user = new Login("Lucas", "teste123", "Lucas@gmail.com");
		repository.save(user);
		return ResponseEntity.status(HttpStatus.OK).body(user);
	}
	
	@GetMapping("/teste")
	public ResponseEntity<List<Login>> lista(){
		List<Login> logins = repository.findAll();
		return ResponseEntity.ok(logins);
	}
	
	@PutMapping("/login/updatePassword/{id}")
	public ResponseEntity<Login> updatePassword(@PathVariable (name = "id") Long id){
		if(repository.findById(id).isPresent()) {
			Login updatePassword = repository.findById(id).get();
			
			updatePassword.setSenha("novapassword");
			Login updatedUser = repository.save(updatePassword);
			return ResponseEntity.ok(updatedUser);
		}
		else {
			return null;
		}
		
	}
	
	
}

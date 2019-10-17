package br.com.bibliotecavivasonhos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.bibliotecavivasonhos.entities.Livro;
import br.com.bibliotecavivasonhos.repository.LivroRepository;

@RestController
public class LivroController {
	
	@Autowired
	private LivroRepository repository;
	
	@PostMapping("/add")
	public ResponseEntity<Livro> add(@RequestBody Livro livro){
		Livro livroCriado = repository.save(livro);
		return ResponseEntity.status(HttpStatus.CREATED).body(livroCriado);
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<Livro>> listAll(){
		List<Livro> livros = repository.findAll();
		return ResponseEntity.ok(livros);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Livro> update(@PathVariable (name = "id") Long id, @RequestBody Livro livro){
		livro.setId(id);
		
		Livro livroModificado = repository.save(livro);
		return ResponseEntity.ok(livroModificado);
		
	}
	
	@GetMapping("/{id}")
	public void delete(@PathVariable(name = "id") Long id){
		repository.deleteById(id);
	}
	
}

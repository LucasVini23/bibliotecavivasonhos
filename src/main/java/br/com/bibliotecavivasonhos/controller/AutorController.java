package br.com.bibliotecavivasonhos.controller;

import java.util.Arrays;
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

import br.com.bibliotecavivasonhos.entities.Autor;
import br.com.bibliotecavivasonhos.repository.AutorRepository;

@RestController
public class AutorController {

	@Autowired
	private AutorRepository repository;
	
	@PostMapping("/author/register")
	public ResponseEntity<Autor> addAuthor(@RequestBody Autor author) {
		Autor createdAuthor = repository.save(author);
		return ResponseEntity.status(HttpStatus.CREATED).body(createdAuthor);
	}
	
	@GetMapping("/author/listAll")
	public ResponseEntity<List<Autor>> listAllAuthors(){
		List<Autor> listAuthors = repository.findAll();
		
		return ResponseEntity.ok(listAuthors);
	}
	
	
	//TENTAR CONSERTAR ESSE METÓDO...
	@PutMapping("/author/books/{id}")
	public ResponseEntity<Autor> updateBooks(@PathVariable (name = "id") Long id) {
		if(repository.findById(id).isPresent()) {
			Autor author = repository.findById(id).get();
			
			author.setLivros(Arrays.asList(author.getLivros() + "21 lições para o século 21"));
			Autor updatedAuthor = repository.save(author);
			System.out.println("--------------------------------------------------------- TESTE");
			return ResponseEntity.ok(updatedAuthor);
		}
		else {
			System.out.println("--------------------------------------------------------- TESTE");
			return null;
		}
	}
	
	
}

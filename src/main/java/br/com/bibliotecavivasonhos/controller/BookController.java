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

import br.com.bibliotecavivasonhos.entities.Book;
import br.com.bibliotecavivasonhos.repository.BookRepository;

@RestController
public class BookController {
	
	@Autowired
	private BookRepository repository;
	
	@PostMapping("/add")
	public ResponseEntity<Book> add(@RequestBody Book book){
		Book livroCriado = repository.save(book);
		return ResponseEntity.status(HttpStatus.CREATED).body(livroCriado);
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<Book>> listAll(){
		List<Book> books = repository.findAll();
		return ResponseEntity.ok(books);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Book> update(@PathVariable (name = "id") Long id, @RequestBody Book book){
		book.setId(id);
		
		Book livroModificado = repository.save(book);
		return ResponseEntity.ok(livroModificado);
		
	}
	
	@GetMapping("/{id}")
	public void delete(@PathVariable(name = "id") Long id){
		repository.deleteById(id);
	}
	
}

package br.com.bibliotecavivasonhos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bibliotecavivasonhos.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}

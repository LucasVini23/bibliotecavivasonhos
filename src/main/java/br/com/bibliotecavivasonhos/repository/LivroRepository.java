package br.com.bibliotecavivasonhos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bibliotecavivasonhos.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}

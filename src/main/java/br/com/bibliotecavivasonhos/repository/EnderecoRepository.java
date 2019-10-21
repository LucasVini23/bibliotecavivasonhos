package br.com.bibliotecavivasonhos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bibliotecavivasonhos.entities.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}

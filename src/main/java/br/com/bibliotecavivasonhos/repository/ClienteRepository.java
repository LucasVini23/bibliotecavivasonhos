package br.com.bibliotecavivasonhos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bibliotecavivasonhos.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}

package br.com.bibliotecavivasonhos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bibliotecavivasonhos.entities.Login;

public interface LoginRepository extends JpaRepository<Login, Long>{

}

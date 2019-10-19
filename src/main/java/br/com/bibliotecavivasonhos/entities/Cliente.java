package br.com.bibliotecavivasonhos.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String idade;
	private String dataNascimento;
	private Endereco endereco;
	private Login login;
	private String telefone;
	private String telefone2;
	private Livro produto;
	private String cpf;

}

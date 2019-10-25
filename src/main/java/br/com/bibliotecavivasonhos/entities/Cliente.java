package br.com.bibliotecavivasonhos.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String idade;
	private String dataNascimento;
	private String endereco;
	private String login;
	private String telefone;
	private String telefone2;
	private String produto;
	private String cpf;
	
	public Cliente(String nome, String idade, String cpf) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}

}

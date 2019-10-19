package br.com.bibliotecavivasonhos.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Livro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nomeLivro;
	private String descricao;
	private String paginasDemo;
	private Autor autor;
	private String avaliacoes;
	private String preco;
	private String entrega;
	private String idioma;
	private String categoria;
	private String editora;
	private String paginas;
	
	public Livro() {
		
	}
	
	public Livro(String descricao, String nomeLivro) {
		this.descricao = descricao;
		this.nomeLivro = nomeLivro;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	
	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}

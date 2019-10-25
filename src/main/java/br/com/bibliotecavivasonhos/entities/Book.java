package br.com.bibliotecavivasonhos.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nomeLivro;
	private String descricao;
//	private String paginasDemo;
	private String autor;
	private String avaliacoes;
	private String preco;
//	private String entrega;
	private String idioma;
	private String categoria;
	private String editora;
	private String paginas;
	
}

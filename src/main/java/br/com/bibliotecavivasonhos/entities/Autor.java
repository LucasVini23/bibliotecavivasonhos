package br.com.bibliotecavivasonhos.entities;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Autor {
	
	private String nome;
	private String idade;
	private String paisOrigem;
	private String generos;
	private String biografia;
	private List<Livro> livros;
	private String fotoAutor;

}

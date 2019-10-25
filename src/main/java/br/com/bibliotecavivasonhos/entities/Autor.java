package br.com.bibliotecavivasonhos.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Autor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String dataNascimento;
	private String paisOrigem;
	private String generos;
	private String biografia;
	
	@ElementCollection
	@CollectionTable(name = "tb_books")
	private List<String> livros = new ArrayList<>();;
	private String fotoAutor;

	public Autor(String nome, String dataNascimento, List<String> livros){
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.livros = livros;
	}
	
	
	
}

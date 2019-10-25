package br.com.bibliotecavivasonhos.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Login {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String usuario;
	private String senha;
	@Email(message = "Email inválido")
	private String email;
	
	public Login(String usuario, String senha, String email) {
		this.usuario = usuario;
		this.senha = senha;
		this.email = email;
	}

}

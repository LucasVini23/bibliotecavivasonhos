package br.com.bibliotecavivasonhos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.bibliotecavivasonhos.entities.Cliente;
import br.com.bibliotecavivasonhos.repository.ClienteRepository;

@RestController
public class ClienteController {

	@Autowired
	private ClienteRepository repository;
	
	@PostMapping("/cliente")
	public ResponseEntity<Cliente> add(@RequestBody Cliente cliente) {
		Cliente clienteCriado = repository.save(cliente);
		return ResponseEntity.status(HttpStatus.CREATED).body(clienteCriado);
	}
	
	@GetMapping("/clientes")
	public ResponseEntity<List<Cliente>> findAll(){
		List<Cliente> clientes = repository.findAll();
		return ResponseEntity.ok().body(clientes);
	}
	
	@PutMapping("/atualizarcliente/{id}")
	public ResponseEntity<Cliente> update(@PathVariable ("id") Long id, @RequestBody Cliente cliente){
		if(repository.findById(id).isPresent()) {
			Cliente clienteEscolhido = repository.findById(id).get();
			
			clienteEscolhido.setNome(cliente.getNome());
			clienteEscolhido.setIdade(cliente.getIdade());
			clienteEscolhido.setDataNascimento(cliente.getDataNascimento());
			clienteEscolhido.setEndereco(cliente.getEndereco());
			clienteEscolhido.setLogin(cliente.getLogin());
			clienteEscolhido.setTelefone(cliente.getTelefone());
			clienteEscolhido.setTelefone2(cliente.getTelefone2());
			clienteEscolhido.setProduto(cliente.getProduto());
			clienteEscolhido.setCpf(cliente.getCpf());
			Cliente clienteEditado = repository.save(clienteEscolhido);
			return ResponseEntity.ok().body(clienteEditado);
		}
		else
		{
			return null;
		}
	}
	
}

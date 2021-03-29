package br.com.rfc.apipro.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rfc.apipro.model.Cliente;
import br.com.rfc.apipro.repository.RepositoryCliente;

@RestController
@RequestMapping("/clientes")
public class ControllerClientes {
	
	@Autowired
	RepositoryCliente repositoryCliente;
	
	@GetMapping
	public List<Cliente> buscaClientes() {
		return  repositoryCliente.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Cliente> buscaClienteUnico(@PathVariable(value = "id") Long id) {
		return  repositoryCliente.findById(id);
	}
	
	@PostMapping
	public Cliente cadastra(@RequestBody Cliente novoCliente) {
		return repositoryCliente.save(novoCliente);
	}
	
	@DeleteMapping("/{id}")
	public void deletaCliente(Cliente id) {
		repositoryCliente.delete(id);
	}
	
	@PutMapping
	public Cliente atualizar(@RequestBody Cliente cliente ) {
		return repositoryCliente.save(cliente);
	}
}

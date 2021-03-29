package br.com.rfc.apipro.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rfc.apipro.model.Cliente;

public interface RepositoryCliente extends JpaRepository<Cliente, Long>{


	Cliente findById(long id);
}

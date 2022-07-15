package carvajal.pruebatecnica.services;

import java.util.List;

import carvajal.pruebatecnica.domain.Cliente;

public interface ClienteService {

	public List<Cliente> findAll();
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
	
	public Cliente findById(Long id);
}

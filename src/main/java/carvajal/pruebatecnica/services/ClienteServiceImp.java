package carvajal.pruebatecnica.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import carvajal.pruebatecnica.domain.Cliente;
import carvajal.pruebatecnica.repository.ClienteRepositoy;

@Service
public class ClienteServiceImp implements ClienteService{

	@Autowired
	private ClienteRepositoy clienteRepositoy;
	
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteRepositoy.findAll();
	}

	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		return clienteRepositoy.save(cliente);
	}

	@Override
	public void delete(Long id) {
		clienteRepositoy.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente findById(Long id) {
		return clienteRepositoy.findById(id).orElse(null);
	}

}

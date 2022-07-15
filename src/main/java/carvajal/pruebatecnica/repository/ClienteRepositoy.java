package carvajal.pruebatecnica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import carvajal.pruebatecnica.domain.Cliente;

public interface ClienteRepositoy extends JpaRepository<Cliente, Long>{

}

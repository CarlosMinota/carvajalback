package carvajal.pruebatecnica.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
@Table(name = "clientes")
public class Cliente implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = "no pude ser vacio")
	@Size(min = 5, max = 25, message = "El nombre debe estar entre 5 y 25 caracteres")
	private String nombres;
	
	@NotEmpty(message = "no pude ser vacio")
	@Size(min = 5, max = 25, message = "El apellido debe estar entre 5 y 25 caracteres")
	private String apellidos;
	
	@Email(message = "no es una dirección de correo bien formada")
	private String email;
	
	@NotEmpty(message = "no pude ser vacio")
	@Size(max = 10, message = "introducir un numero valido")
	private String telefono;
	
	@NotEmpty(message = "no pude ser vacio")
	@Size(max = 13, message = "introducir un celular valido")
	private String celular;
	
	@NotEmpty(message = "no pude ser vacio")
	@Size(max = 13, message = "introducir una cedula valida")
	private String cedula;

}

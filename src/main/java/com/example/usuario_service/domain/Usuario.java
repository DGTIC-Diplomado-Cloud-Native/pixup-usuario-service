package com.example.usuario_service.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection="usuarios")
public class Usuario {
	
	@Id
	private String id;
	@NotBlank(message="Nombre no puede ser blanco")
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String password;
	@NotBlank(message="Email no puede ser blanco")
	private String email;
	private String rfc;
	private Domicilio domicilio;

}

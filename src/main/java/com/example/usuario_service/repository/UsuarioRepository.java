package com.example.usuario_service.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.usuario_service.domain.Usuario;

public interface UsuarioRepository 
	extends MongoRepository<Usuario, String>{
	
	Optional<Usuario> findByEmail(String email);

}

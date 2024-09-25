package com.example.usuario_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.usuario_service.domain.Estado;

public interface EstadoRepository 
	extends MongoRepository<Estado, String>{

}
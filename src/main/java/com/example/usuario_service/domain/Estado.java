package com.example.usuario_service.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection="estados")
public class Estado {
	
	@Id
	private String id;
	private String nombre;

}

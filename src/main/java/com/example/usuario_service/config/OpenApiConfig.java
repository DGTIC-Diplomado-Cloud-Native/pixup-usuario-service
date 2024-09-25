package com.example.usuario_service.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
		info = @Info(
			version = "v1",
			title = "Pixup Usuario Microservice Endpoints", 
			description = "Definición de los Endpoints de "
					+ "Usuario Service para el sistema Pixup", 
			contact = @Contact(
				name = "UNAM", 
				url = "https://www.unam.mx/", 
			email = "aluna1997@ciencias.unam.mx")))
public class OpenApiConfig {

}
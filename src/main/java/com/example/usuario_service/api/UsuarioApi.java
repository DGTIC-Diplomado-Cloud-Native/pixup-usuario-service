package com.example.usuario_service.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import com.example.usuario_service.domain.Usuario;
import com.example.usuario_service.dto.RegistroUsuarioRequest;

@RequestMapping(path="usuarios", produces="application/json")
@CrossOrigin(origins="*")
@Tag(name="usuario", description="API del Recurso Usuario")
public interface UsuarioApi {
	
	@Operation(summary = "Registrar Usuario")
	@ApiResponses(value = { 
	  @ApiResponse(responseCode = "201", 
		description = "Usuario Creado Exitosamente", 
	    content = { 
	    	@Content(mediaType="application/json", 
	    	schema = @Schema(implementation=Usuario.class)) }),
	  @ApiResponse(responseCode = "409", 
	  	description="Ya existe un usuario con el mail especificado", 
	    content = @Content) })
	@PostMapping(path="registro", consumes="application/json")
	@ResponseStatus(HttpStatus.CREATED)
	Usuario registrarUsuario(
		@NotNull @Valid @RequestBody RegistroUsuarioRequest request);

}
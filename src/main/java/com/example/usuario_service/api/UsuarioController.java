package com.example.usuario_service.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.usuario_service.domain.Usuario;
import com.example.usuario_service.dto.RegistroUsuarioRequest;
import com.example.usuario_service.service.UsuarioService;

@RestController
public class UsuarioController implements UsuarioApi {

	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public Usuario registrarUsuario(
			RegistroUsuarioRequest request) {
		return usuarioService.registrarUsuario(
			request.getUsuario(), request.getDomicilio());
	}

}

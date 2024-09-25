package com.example.usuario_service.service;

import com.example.usuario_service.domain.Domicilio;
import com.example.usuario_service.domain.Usuario;

public interface UsuarioService {
	
	Usuario registrarUsuario(
		Usuario usuario, Domicilio domicilio);

}
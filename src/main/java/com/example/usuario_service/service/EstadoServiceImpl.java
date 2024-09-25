package com.example.usuario_service.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.usuario_service.domain.Estado;
import com.example.usuario_service.repository.EstadoRepository;

@Service
public class EstadoServiceImpl implements EstadoService {
	
	@Autowired
	private EstadoRepository estadoRepository;

	@Override
	public Estado actualizarEstado(String id, Estado estado) {
		Optional<Estado> estadoExistente = estadoRepository.findById(id);
		if (estadoExistente.isPresent()) {
			Estado estadoActualizar = estadoExistente.get();
			estadoActualizar.setNombre(estado.getNombre());
			estadoRepository.save(estadoActualizar);
			return estadoActualizar;
		}
		return null;
	}

}

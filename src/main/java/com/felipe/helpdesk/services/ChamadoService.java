package com.felipe.helpdesk.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipe.helpdesk.domain.Chamado;
import com.felipe.helpdesk.repositories.ChamadoRepository;
import com.felipe.helpdesk.services.exception.ObjectnotFoundException;

@Service
public class ChamadoService {

	@Autowired
	private ChamadoRepository repository;

	public Chamado findById(Integer id) {
		Optional<Chamado> obj = repository.findById(id);

		return obj.orElseThrow(() -> new ObjectnotFoundException("objeto não encontrado! ID: " + id));
	}
	
	public List<Chamado> findAll() {
		return repository.findAll();
	}
	
	
}

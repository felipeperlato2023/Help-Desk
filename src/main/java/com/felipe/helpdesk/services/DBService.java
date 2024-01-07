package com.felipe.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipe.helpdesk.domain.Chamado;
import com.felipe.helpdesk.domain.Cliente;
import com.felipe.helpdesk.domain.Tecnico;
import com.felipe.helpdesk.domain.enums.Perfil;
import com.felipe.helpdesk.domain.enums.Prioridade;
import com.felipe.helpdesk.domain.enums.Status;
import com.felipe.helpdesk.repositories.ChamadoRepository;
import com.felipe.helpdesk.repositories.ClienteRepository;
import com.felipe.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
  
	@Autowired
	TecnicoRepository tecnicoRepository;
	@Autowired
	ClienteRepository clienteRepository;
	@Autowired
	ChamadoRepository chamadoRepository;
	
	public void instanciaDB()
	{
		Tecnico t1 = new Tecnico(null, "felipe"," 5564654564", "fe.perlato@gdfgdf", "1321");
		t1.addPerfil(Perfil.CLIENTE);
				
		Cliente c1 = new Cliente(null, "joao"," 5564678564", "fe.perlato@wdwd", "1321");
		c1.addPerfil(Perfil.CLIENTE);
		
		Chamado ch1 = new Chamado(null, Prioridade.ALTA,Status.ABERTO, "chamado 01", "Primeiro chamado", t1, c1);
		
		tecnicoRepository.saveAll(Arrays.asList(t1));
		clienteRepository.saveAll(Arrays.asList(c1));
		chamadoRepository.saveAll(Arrays.asList(ch1));
	}
	
	
	
	
	
	
	
	
	
}

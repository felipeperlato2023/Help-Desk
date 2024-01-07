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
		Tecnico t1 = new Tecnico(null, "felipe"," 5564654564", "fe.perlato@fgdfrgdf", "1321");
		t1.addPerfil(Perfil.TECNICO);
		
		Tecnico t2 = new Tecnico(null, "maria"," 534343654564", "fe.perlatfo@grdfgdf", "1321");
		t1.addPerfil(Perfil.TECNICO);
		
		Tecnico t3 = new Tecnico(null, "joao"," 2332354564", "fe.perlato@ggdffgdf", "1321");
		t1.addPerfil(Perfil.TECNICO);
				
		Cliente c1 = new Cliente(null, "lucas"," 2121678564", "fe.perlato@wdfwd", "1321");
		c1.addPerfil(Perfil.CLIENTE);
		
		Cliente c2 = new Cliente(null, "mariana"," 1111111", "fe.perlato@wedfwd", "1321");
		c1.addPerfil(Perfil.CLIENTE);
		
		Cliente c3 = new Cliente(null, "antonio","11111111", "fe.perlato@fwdfwd", "1321");
		c1.addPerfil(Perfil.CLIENTE);
		
		Chamado ch1 = new Chamado(null, Prioridade.ALTA,Status.ANDAMENTO, "chamado 01", "Primeiro chamado", t1, c1);
		
		Chamado ch2 = new Chamado(null, Prioridade.ALTA,Status.ENCERRADO, "chamado 01", "Primeiro chamado", t1, c1);
		
		Chamado ch3 = new Chamado(null, Prioridade.ALTA,Status.ABERTO, "chamado 01", "Primeiro chamado", t1, c1);
		
		tecnicoRepository.saveAll(Arrays.asList(t1,t2,t3));
		clienteRepository.saveAll(Arrays.asList(c1,c2,c3));
		chamadoRepository.saveAll(Arrays.asList(ch1,ch2,ch3));
	}
	
	
	
	
	
	
	
	
	
}

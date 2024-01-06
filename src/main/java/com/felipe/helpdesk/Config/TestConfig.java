package com.felipe.helpdesk.Config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.felipe.helpdesk.domain.Chamado;
import com.felipe.helpdesk.domain.Cliente;
import com.felipe.helpdesk.domain.Tecnico;
import com.felipe.helpdesk.domain.enums.Prioridade;
import com.felipe.helpdesk.domain.enums.Status;
import com.felipe.helpdesk.repositories.ChamadoRepository;
import com.felipe.helpdesk.repositories.ClienteRepository;
import com.felipe.helpdesk.repositories.TecnicoRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	TecnicoRepository tecnicoRepository;
	@Autowired
	ClienteRepository clienteRepository;
	@Autowired
	ChamadoRepository chamadoRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Tecnico t1 = new Tecnico(null, "felipe", "1038960992", " fe.perlato@gmail.com", " 123");

		Cliente c1 = new Cliente(null, "joao", "10878950147", "joaojoao@gmail.com", "123");

		Chamado ch1 = new Chamado(null, Prioridade.ALTA, Status.ABERTO, "setor 1", "arrumar o pc q nao liga", t1, c1);
		Chamado ch2 = new Chamado(null, Prioridade.ALTA, Status.ABERTO, "setor 1", "arrumar o pc q nao liga", t1, c1);
		Chamado ch3 = new Chamado(null, Prioridade.ALTA, Status.ABERTO, "setor 1", "arrumar o pc q nao liga", t1, c1);

		tecnicoRepository.saveAll(Arrays.asList(t1));
		clienteRepository.saveAll(Arrays.asList(c1));
		chamadoRepository.saveAll(Arrays.asList(ch1, ch2, ch3));

	}

}

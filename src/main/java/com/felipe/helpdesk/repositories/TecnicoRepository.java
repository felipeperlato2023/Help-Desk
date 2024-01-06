package com.felipe.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.helpdesk.domain.Cliente;
import com.felipe.helpdesk.domain.Pessoa;
import com.felipe.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}

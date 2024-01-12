package com.felipe.helpdesk.domain.dtos;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.felipe.helpdesk.domain.Chamado;

public class ChamadoDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataAbertura = LocalDate.now();
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataFechamento = LocalDate.now();
	private Integer prioridade;
	private Integer status;
	private String titulo;
	private String obervacoes;
	private Integer tecnico;
	private Integer cliente;
	private String nomeTecnico;
	private String nomeCliente;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public LocalDate getDataFechamento() {
		return dataFechamento;
	}

	public void setDataFechamento(LocalDate dataFechamento) {
		this.dataFechamento = dataFechamento;
	}

	public Integer getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Integer prioridade) {
		this.prioridade = prioridade;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getObervacoes() {
		return obervacoes;
	}

	public void setObervacoes(String obervacoes) {
		this.obervacoes = obervacoes;
	}

	public Integer getTecnico() {
		return tecnico;
	}

	public void setTecnico(Integer tecnico) {
		this.tecnico = tecnico;
	}

	public Integer getCliente() {
		return cliente;
	}

	public void setCliente(Integer cliente) {
		this.cliente = cliente;
	}

	public String getNomeTecnico() {
		return nomeTecnico;
	}

	public void setNomeTecnico(String nomeTecnico) {
		this.nomeTecnico = nomeTecnico;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public ChamadoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChamadoDTO(Chamado obj) {
		super();
		this.id =obj.getId();
		this.dataAbertura = obj.getDataAbertura();;
		this.dataFechamento = obj.getDataFechamento();
		this.prioridade = obj.getPrioridade().getCode();
		this.status = obj.getStatus().getCode();
		this.titulo = obj.getTitulo();
		this.obervacoes = obj.getObervacoes();
		this.tecnico = obj.getTecnico().getId();
		this.cliente = obj.getCliente().getId();
		this.nomeTecnico = obj.getTecnico().getNome();
		this.nomeCliente = obj.getCliente().getNome();
	}
}

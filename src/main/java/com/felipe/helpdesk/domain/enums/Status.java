package com.felipe.helpdesk.domain.enums;

public enum Status {
	ABERTO(0, "ABERTO"), ANDAMENTO(1, "ANDAMENTO"), ENCERRADO(2, "ENCERRADO");

	private String descricao;

	private Integer code;

	private Status(Integer code, String descricao) {
		this.code = code;
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public Integer getCode() {
		return code;
	}

	public static Status toEnum(Integer code) {
		if (code == null)
			return null;

		for (Status x : Status.values()) {
			if (code.equals(x.getCode())) {
				return x;
			}

		}
		throw new IllegalArgumentException("status invalido");
	}
}

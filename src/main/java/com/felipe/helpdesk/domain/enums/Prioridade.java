package com.felipe.helpdesk.domain.enums;

public enum Prioridade {
	BAIXA(0, "BAIXA"), MEDIA(1, "MEDIA"),ALTA(2, "ALTA");

	private String descricao;

	private Integer code;

	private Prioridade(Integer code, String descricao) {
		this.code = code;
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public Integer getCode() {
		return code;
	}

	public static Prioridade toEnum(Integer code) {
		if (code == null)
			return null;

		for (Prioridade x : Prioridade.values()) {
			if (code.equals(x.getCode())) {
				return x;
			}

		}
		throw new IllegalArgumentException("prioridade invalido");
	}
}

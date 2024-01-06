package com.felipe.helpdesk.domain.enums;

public enum Perfil {
	ADMIN(0, "ROLE_ADMIN"), CLIENTE(1, "ROLE_CLIENTE"), TECNICO(2, "ROLE_TECNICO");

	private String descricao;

	private Integer code;

	private Perfil(Integer code, String descricao) {
		this.code = code;
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public Integer getCode() {
		return code;
	}

	public static Perfil toEnum(Integer code) {
		if (code == null)
			return null;

		for (Perfil x : Perfil.values()) {
			if (code.equals(x.getCode())) {
				return x;
			}

		}
		throw new IllegalArgumentException("perfil invalido");
	}
}

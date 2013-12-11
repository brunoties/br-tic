package com.BrTicOs.modelo;

public enum StatusAtendimento {
	
	AGUARDANDO_ATENDIMENTO("Aguardando Atendimento"), 
	EM_ATENDIMENTO("Em Atendimento"), 
	PENDENTE("Pendente"), 
	FECHADO("Fechado");
	
	public String descricao;

	private StatusAtendimento(String descricao) {
		this.descricao = descricao;
	}
	
	public String toString() {
		return descricao;
	}
	
}

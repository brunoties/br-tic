package com.BrTicOs.modelo;

import java.io.Serializable;
import java.util.Calendar;

public class Atendimento implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer codigo;
	private String status;
	private String itemConfiguracao;
	private String solicitacao;
	private Calendar dtHrAbertura;
	private Calendar dtHrFechamento;
	// tela de erro
	private String observacao;
	
	public Atendimento() {
	}
	public Atendimento(String status, String itemConfiguracao,
			String solicitacao, Calendar dtHrAbertura, Calendar dtHrFechamento,
			String observacao) {
		this.status = status;
		this.itemConfiguracao = itemConfiguracao;
		this.solicitacao = solicitacao;
		this.dtHrAbertura = dtHrAbertura;
		this.dtHrFechamento = dtHrFechamento;
		this.observacao = observacao;
	}
	public Atendimento(Integer codigo, String status, String itemConfiguracao,
			String solicitacao, Calendar dtHrAbertura, Calendar dtHrFechamento,
			String observacao) {
		this.codigo = codigo;
		this.status = status;
		this.itemConfiguracao = itemConfiguracao;
		this.solicitacao = solicitacao;
		this.dtHrAbertura = dtHrAbertura;
		this.dtHrFechamento = dtHrFechamento;
		this.observacao = observacao;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getItemConfiguracao() {
		return itemConfiguracao;
	}
	public void setItemConfiguracao(String itemConfiguracao) {
		this.itemConfiguracao = itemConfiguracao;
	}
	public String getSolicitacao() {
		return solicitacao;
	}
	public void setSolicitacao(String solicitacao) {
		this.solicitacao = solicitacao;
	}
	public Calendar getDtHrAbertura() {
		return dtHrAbertura;
	}
	public void setDtHrAbertura(Calendar dtHrAbertura) {
		this.dtHrAbertura = dtHrAbertura;
	}
	public Calendar getDtHrFechamento() {
		return dtHrFechamento;
	}
	public void setDtHrFechamento(Calendar dtHrFechamento) {
		this.dtHrFechamento = dtHrFechamento;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public Integer getCodigo() {
		return codigo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Atendimento other = (Atendimento) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Atendimento [codigo=" + codigo + ", status=" + status
				+ ", itemConfiguracao=" + itemConfiguracao + ", solicitacao="
				+ solicitacao + ", dtHrAbertura=" + dtHrAbertura
				+ ", dtHrFechamento=" + dtHrFechamento + ", observacao="
				+ observacao + "]";
	}

}

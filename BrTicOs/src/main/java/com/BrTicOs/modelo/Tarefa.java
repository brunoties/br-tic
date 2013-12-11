package com.BrTicOs.modelo;

import java.io.Serializable;
import java.util.Calendar;

public class Tarefa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long codigo;
	private Calendar dtHrAbertura;
	private Calendar dtHrFechamento;
	private String descricao;
	private Usuario usuario;
	private Atendimento atendimento;
	
	public Tarefa() {
	}
	public Tarefa(Calendar dtHrAbertura, Calendar dtHrFechamento,
			String descricao, Usuario usuario) {
		this.dtHrAbertura = dtHrAbertura;
		this.dtHrFechamento = dtHrFechamento;
		this.descricao = descricao;
		this.usuario = usuario;
	}
	public Tarefa(Long codigo, Calendar dtHrAbertura, Calendar dtHrFechamento,
			String descricao, Usuario usuario) {
		this.codigo = codigo;
		this.dtHrAbertura = dtHrAbertura;
		this.dtHrFechamento = dtHrFechamento;
		this.descricao = descricao;
		this.usuario = usuario;
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public Atendimento getAtendimento() {
		return atendimento;
	}
	public void setAtendimento(Atendimento atendimento) {
		this.atendimento = atendimento;
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
		Tarefa other = (Tarefa) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Tarefa [codigo=" + codigo + ", dtHrAbertura=" + dtHrAbertura
				+ ", dtHrFechamento=" + dtHrFechamento + ", descricao="
				+ descricao + ", usuario=" + usuario + "]";
	}

}

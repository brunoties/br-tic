package com.BrTicOs.modelo;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TB_TAR_TAREFA")
public class Tarefa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TAR_CODIGO")
	private Long codigo;
	
	@Column(name = "TAR_DT_HR_ABERTURA")
	@Temporal(value = TemporalType.TIMESTAMP)
	private Calendar dtHrAbertura;
	
	@Column(name = "TAR_DT_HR_FECHAMENTO")
	@Temporal(value = TemporalType.TIMESTAMP)
	private Calendar dtHrFechamento;
	
	@Column(name = "TAR_DESCRICAO")
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "USU_CODIGO", referencedColumnName = "USU_CODIGO")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "ATE_CODIGO", referencedColumnName = "ATE_CODIGO")
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

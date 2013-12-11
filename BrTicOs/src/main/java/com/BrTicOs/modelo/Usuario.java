package com.BrTicOs.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_USU_USUARIO")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USU_CODIGO")
	private Long codigo;
	
	@Column(name = "USU_NOME")
	private String nome;
	
	@Column(name = "USU_EMAIL")
	private String email;
	
	@Column(name = "USU_SENHA")
	private String senha;
	
	@ManyToOne
	@JoinColumn(name = "PAP_CODIGO", referencedColumnName = "PAP_CODIGO")
	private Papel papel;
	
	public Usuario() {
	}
	public Usuario(String nome, String email, String senha, Papel papel) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.papel = papel;
	}
	public Usuario(Long codigo, String nome, String email, String senha,
			Papel papel) {
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.papel = papel;
	}
	
	public Usuario(String nome, String email, String senha) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Papel getPapel() {
		return papel;
	}
	public void setPapel(Papel papel) {
		this.papel = papel;
	}
	public Long getCodigo() {
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
		Usuario other = (Usuario) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Usuario [codigo=" + codigo + ", nome=" + nome + ", email="
				+ email + ", senha=" + senha + ", papel=" + papel + "]";
	}
	
}

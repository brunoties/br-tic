package com.BrTicOs.controle;

import java.io.Serializable;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import com.BrTicOs.modelo.Atendimento;

@Named
@ViewScoped
public class CadastroAtendimentoBean implements Serializable {

	private static final long serialVersionUID = 1207624101893394523L;
	
	private Atendimento atendimento;
	
	private String cliente;
	
	public CadastroAtendimentoBean() {
		atendimento = new Atendimento();
		cliente = new String();
	}
	
	public void salvar(){}

	public Atendimento getAtendimento() {
		return atendimento;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
}

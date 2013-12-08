package com.BrTicOs.visao;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class NovoAtendimentoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String cliente;

	public String getCliente() {
		return cliente;
	}

	public void setPapel(String cliente) {
		this.cliente = cliente;
	}

}

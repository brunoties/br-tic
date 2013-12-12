package com.BrTicOs.visao;

import java.io.Serializable;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class NovoAtendimentoBean implements Serializable {

	private static final long serialVersionUID = 1207624101893394523L;
	
	private String cliente = new String();

	public String getCliente() {
		return cliente;
	}

	public void setPapel(String cliente) {
		this.cliente = cliente;
	}

}

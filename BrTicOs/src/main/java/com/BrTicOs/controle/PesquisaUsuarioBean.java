package com.BrTicOs.controle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class PesquisaUsuarioBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<Integer> usuariosFiltrados;
	
	public PesquisaUsuarioBean() {
		this.usuariosFiltrados = new ArrayList<>();
		for(int i = 0; i < 50; i++) {
			this.usuariosFiltrados.add(i);
		}
	}

	public List<Integer> getUsuariosFiltrados() {
		return usuariosFiltrados;
	}

}

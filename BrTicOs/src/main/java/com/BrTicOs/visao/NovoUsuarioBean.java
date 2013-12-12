package com.BrTicOs.visao;

import java.io.Serializable;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import com.BrTicOs.modelo.Usuario;

@Named
@ViewScoped
public class NovoUsuarioBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Usuario usuario;

	public NovoUsuarioBean() {
		usuario = new Usuario();
	}

	public Usuario getUsuario() {
		return usuario;
	}

}

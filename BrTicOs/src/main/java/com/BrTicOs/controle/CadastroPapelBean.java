package com.BrTicOs.controle;

import java.io.Serializable;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import com.BrTicOs.modelo.Papel;

@Named
@ViewScoped
public class CadastroPapelBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Papel papel;
	
	public CadastroPapelBean() {
		papel = new Papel();
	}

	public Papel getPapel() {
		return papel;
	}
	
	public void salvar() {
		
	}
}

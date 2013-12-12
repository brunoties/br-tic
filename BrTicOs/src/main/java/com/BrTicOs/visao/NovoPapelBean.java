package com.BrTicOs.visao;

import java.io.Serializable;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import com.BrTicOs.modelo.Papel;

@Named
@ViewScoped
public class NovoPapelBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Papel papel;
	
	public NovoPapelBean() {
		papel = new Papel();
	}

	public Papel getPapel() {
		return papel;
	}

	public void setPapel(Papel papel) {
		this.papel = papel;
	}
	
	public void salvar() {
		
	}
}

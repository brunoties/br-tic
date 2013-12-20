package com.BrTicOs.controle;

import java.io.Serializable;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.BrTicOs.modelo.Papel;
import com.BrTicOs.service.CadastroPapelService;
import com.BrTicOs.service.NegocioException;
import com.BrTicOs.util.jsf.FacesUtil;

@Named
@ViewScoped
public class CadastroPapelBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private CadastroPapelService cadastroPapelService;
	
	private Papel papel;
	
	public CadastroPapelBean() {
		limpar();
	}
	
	private void limpar() {
		papel = new Papel();
	}
	
	
	public void salvar() {
		papel = cadastroPapelService.salvar(papel);
		limpar();
		FacesUtil.addSuccessMessage("Papel cadastrado com sucesso.");
	}
	
	public Papel getPapel() {
		return papel;
	}
	
	public void setPapel(Papel papel) {
		this.papel = papel;
	}

}

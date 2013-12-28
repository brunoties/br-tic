package com.BrTicOs.controle;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.BrTicOs.modelo.Papel;
import com.BrTicOs.repository.PapelRepository;
import com.BrTicOs.repository.filter.PapelRepositoryFilter;

@Named
@ViewScoped
public class PesquisaPapelBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private List<Papel> papeisFiltrados;
	
	@Inject
	private PapelRepository papelRepository;
	
	private PapelRepositoryFilter filtro;
	
	public void pesquisar() {
		papeisFiltrados = papelRepository.filtrados(filtro);
	}
	
	public PesquisaPapelBean() {
		filtro = new PapelRepositoryFilter();
	}

	public List<Papel> getPapeisFiltrados() {
		return papeisFiltrados;
	}

	public PapelRepositoryFilter getFiltro() {
		return filtro;
	}

}

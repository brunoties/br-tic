package com.BrTicOs.controle;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.BrTicOs.modelo.Usuario;
import com.BrTicOs.repository.UsuarioRepository;
import com.BrTicOs.repository.filter.UsuarioRepositoryFilter;

@Named
@ViewScoped
public class PesquisaUsuarioBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<Usuario> usuariosFiltrados;
	
	@Inject
	private UsuarioRepository usuarioRepository;
	
	private UsuarioRepositoryFilter filtro;
	
	public void pesquisar() {
		usuariosFiltrados = usuarioRepository.filtrados(filtro);
	}
	
	public PesquisaUsuarioBean() {
		filtro = new UsuarioRepositoryFilter();
	}

	public List<Usuario> getUsuariosFiltrados() {
		return usuariosFiltrados;
	}

	public UsuarioRepositoryFilter getFiltro() {
		return filtro;
	}

}

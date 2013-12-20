package com.BrTicOs.controle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.faces.event.ComponentSystemEvent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.BrTicOs.modelo.Papel;
import com.BrTicOs.modelo.Usuario;
import com.BrTicOs.repository.PapelRepository;
import com.BrTicOs.service.CadastroUsuarioService;
import com.BrTicOs.util.jsf.FacesUtil;

@Named
@ViewScoped
public class CadastroUsuarioBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private PapelRepository papelRepository;
	
	@Inject
	private CadastroUsuarioService cadastroUsuarioService;
	
	private List<Papel> papeis;

	private Usuario usuario;
	
	private Papel papel;

	public CadastroUsuarioBean() {
		limpar();
	}

	public List<Papel> getPapeis() {
		return papeis;
	}

	public void inicializar(ComponentSystemEvent csv) {
		
		System.out.println("inicializando...");
		
		if(FacesUtil.isNotPostback()) {
			papeis = papelRepository.getAll();
		}
			
	}
	
	public void salvar() {
		usuario.setPapel(papel);
		usuario = cadastroUsuarioService.salvar(usuario);
		limpar();
		FacesUtil.addSuccessMessage("Papel cadastrado com sucesso");
	}
	
	private void limpar() {
		usuario = new Usuario();
		papel = new Papel();
		papeis = new ArrayList<Papel>();
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Papel getPapel() {
		return papel;
	}

	public void setPapel(Papel papel) {
		this.papel = papel;
	}

}

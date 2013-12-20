package com.BrTicOs.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.BrTicOs.modelo.Usuario;
import com.BrTicOs.repository.UsuarioRepository;

public class CadastroUsuarioService implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private UsuarioRepository usuarioRepository;
	
	public Usuario salvar(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

}

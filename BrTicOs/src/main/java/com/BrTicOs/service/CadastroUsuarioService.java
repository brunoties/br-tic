package com.BrTicOs.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.BrTicOs.modelo.Usuario;
import com.BrTicOs.repository.UsuarioRepository;
import com.BrTicOs.util.jpa.Transactional;

public class CadastroUsuarioService implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private UsuarioRepository usuarioRepository;
	
	@Transactional
	public Usuario salvar(Usuario usuario) {
		
		Usuario usuarioExistente = usuarioRepository.byName(usuario.getNome());
		
		if(usuarioExistente != null) {
			throw new NegocioException("Já existe um Usuário com o nome informado!");
		}
		
		return usuarioRepository.put(usuario);
	}

}

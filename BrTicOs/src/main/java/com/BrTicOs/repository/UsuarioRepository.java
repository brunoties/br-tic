package com.BrTicOs.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.BrTicOs.modelo.Usuario;

public class UsuarioRepository implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	EntityManager manager;
	
	public List<Usuario> getAll() {
		return manager.createQuery("from Usuario", Usuario.class).getResultList();
	}
	
	public Usuario byCode(Long code) {
		return manager.find(Usuario.class, code);
	}
	
	public Usuario save(Usuario usuario) {
		EntityTransaction trx = manager.getTransaction();
		
		trx.begin();
		
		usuario = manager.merge(usuario);
		
		trx.commit();
		
		return usuario;
	}
	
}

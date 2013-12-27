package com.BrTicOs.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import com.BrTicOs.modelo.Usuario;

public class UsuarioRepository implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	EntityManager manager;

	public List<Usuario> getAll() {
		return manager.createQuery("from Usuario", Usuario.class)
				.getResultList();
	}

	public Usuario byCode(Long code) {
		return manager.find(Usuario.class, code);
	}

	public Usuario byName(String nome) {
		try {
			return manager.createQuery("from Usuario where upper(nome) = :nome", Usuario.class)
				.setParameter("nome", nome.toUpperCase())
				.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

	public Usuario put(Usuario usuario) {
		return manager.merge(usuario);
	}

}

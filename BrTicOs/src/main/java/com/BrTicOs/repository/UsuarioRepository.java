package com.BrTicOs.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.BrTicOs.modelo.Usuario;
import com.BrTicOs.repository.filter.UsuarioRepositoryFilter;

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
	
	@SuppressWarnings("unchecked")
	public List<Usuario> filtrados(UsuarioRepositoryFilter filtro) {
		
		Session session = manager.unwrap(Session.class);
		
		Criteria criteria = session.createCriteria(Usuario.class);
		
		if(StringUtils.isNotBlank(filtro.getNome())) {
			criteria.add(Restrictions.ilike("nome", filtro.getNome(), MatchMode.ANYWHERE));
		}
		
		if(StringUtils.isNotBlank(filtro.getEmail())) {
			criteria.add(Restrictions.eq("email", filtro.getEmail()));
		}
		
		return criteria.addOrder(Order.asc("nome")).list();
	}

	public Usuario put(Usuario usuario) {
		return manager.merge(usuario);
	}

}

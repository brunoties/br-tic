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

import com.BrTicOs.modelo.Papel;
import com.BrTicOs.repository.filter.PapelRepositoryFilter;

public class PapelRepository implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	EntityManager manager;
	
	public List<Papel> getAll() {
		return manager.createQuery("from Papel", Papel.class).getResultList();
	}
	
	public Papel byCode(Long code) {
		return manager.find(Papel.class, code);
	}
	
	public Papel byName(String nome) {
		try {
			return manager.createQuery("from Papel where upper(nome) = :nome", Papel.class)
				.setParameter("nome", nome.toUpperCase())
				.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Papel> filtrados(PapelRepositoryFilter filtro) {
		Session session = manager.unwrap(Session.class);
		
		Criteria criteria = session.createCriteria(Papel.class);
		
		if(StringUtils.isNotBlank(filtro.getNome())) {
			criteria.add(Restrictions.ilike("nome", filtro.getNome(), MatchMode.ANYWHERE));
		}
		
		return criteria.addOrder(Order.asc("nome")).list();
	}
	
	public Papel put(Papel papel) {		
		return manager.merge(papel);
	}
}

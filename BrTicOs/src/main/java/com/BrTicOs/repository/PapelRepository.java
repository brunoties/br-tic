package com.BrTicOs.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.BrTicOs.modelo.Papel;

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
	
	public Papel save(Papel papel) {
		EntityTransaction trx = manager.getTransaction();
		
		trx.begin();
		
		papel = manager.merge(papel);
		
		trx.commit();
		return papel;
	}
}

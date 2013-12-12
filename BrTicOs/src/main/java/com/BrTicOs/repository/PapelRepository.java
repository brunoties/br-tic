package com.BrTicOs.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

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
}

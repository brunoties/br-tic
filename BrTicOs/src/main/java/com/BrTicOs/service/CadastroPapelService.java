package com.BrTicOs.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.BrTicOs.modelo.Papel;
import com.BrTicOs.repository.PapelRepository;
import com.BrTicOs.util.jpa.Transactional;

public class CadastroPapelService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private PapelRepository papelRepository;
	
	@Transactional
	public Papel salvar(Papel papel) {
		
		Papel papelExistente = papelRepository.byName(papel.getNome());
		
		if(papelExistente != null) {
			throw new NegocioException("Já existe um Papel com o nome informado!");
		}
		
		return papelRepository.put(papel);
	}

}

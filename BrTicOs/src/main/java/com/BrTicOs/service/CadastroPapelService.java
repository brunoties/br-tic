package com.BrTicOs.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.BrTicOs.modelo.Papel;
import com.BrTicOs.repository.PapelRepository;

public class CadastroPapelService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private PapelRepository papelRepository;
	
	public Papel salvar(Papel papel) {
		return papelRepository.save(papel);
	}

}

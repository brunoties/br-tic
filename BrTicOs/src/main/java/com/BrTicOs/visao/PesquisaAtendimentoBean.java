package com.BrTicOs.visao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class PesquisaAtendimentoBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private List<Integer> atendimentosFiltrados;
	
	public PesquisaAtendimentoBean() {
		atendimentosFiltrados = new ArrayList<>();
		for(int i = 0; i < 50; i++) {
			atendimentosFiltrados.add(i);
		}
	}

	public List<Integer> getAtendimentosFiltrados() {
		return atendimentosFiltrados;
	}
	
}

package com.BrTicOs.visao;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class PesquisaAtendimentoBean {
	
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

package com.BrTicOs.visao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

//import com.BrTicOs.modelo.Papel;
@ManagedBean
@ViewScoped
public class PesquisaPapelBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private List<Integer> papeisFiltrados;
	
	public PesquisaPapelBean() {
		this.papeisFiltrados = new ArrayList<Integer>();
		for(int i = 0; i < 50; i++) {
			this.papeisFiltrados.add(i);
		}
	}

	public List<Integer> getPapeisFiltrados() {
		return papeisFiltrados;
	}

}

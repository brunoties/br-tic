package com.BrTicOs.service;

import java.io.Serializable;

public class TesteCalculadoraService implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public double calcularPreco(int quantidade, double valor) {
		return quantidade * valor;
	}

}

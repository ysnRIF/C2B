package com.flota.dominio;

public class Caja {
	
	private double peso;
	
	public Caja(){
		this.peso = 100;
	}
	
	public void setPeso(double peso) {
		//TODO check what to do here man !!
		
		//validar peso
		if(peso <= 0) {
			throw new RuntimeException("El peso de la caja no pude ser negativo");
		}
		
		this.peso = peso;
		
	}
	
	public double getPeso() {
		return peso;
	}

}

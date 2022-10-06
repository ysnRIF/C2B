package com.curso.maqexp.Proy004_MaquinaExpend;

public class MaquinaExpendedora {
	
	private final double saldoMinimo = 100.0;
	private final double saldoMaximo = 1000;
	private double saldoActual;
	private int numVentas;
	
	public MaquinaExpendedora(double saldoActual, int numVentas) {
		this.saldoActual = saldoActual;
		this.numVentas = numVentas;
	}

	public double getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(double saldoActual) {
		this.saldoActual = saldoActual;
	}

	public int getNumVentas() {
		return numVentas;
	}

	public void setNumVentas(int numVentas) {
		this.numVentas = numVentas;
	}

	public double getSaldoMinimo() {
		return saldoMinimo;
	}

	public double getSaldoMaximo() {
		return saldoMaximo;
	}
	
	public void display(String sabor) {
		
		System.out.println();
		
	}
	
	public void reponerRefersco(String sabor,double p, double q) {
		
		
		
	}
	

}

package com.flota.dominio;

/**
 * clase que describa un vehiculo
 * puede transportar una caja
 * la caja debe tener un peso
 * @author alumno
 * @version 1.0
 * 
 *
 */
public class Vehiculo {
	
	//atributos
	
	private double cargaMaxima;
	private String matricula;
	//private double cargaMax = 3000.0;
	private double cargaActual = 0.0;
	private int numCajas = 0;
	
	// to declar a constant you need to write in in MAJ
	
	//public final double CARGA_MAXIMA = 55555.27;
	
	//constructores
	//validar matricula no null
	//validar carga no es negativa
	
	public Vehiculo(String matricula, double cargaMaxima) {
		this.matricula = matricula;
		this.cargaMaxima = cargaMaxima;
	}
	
	
	//metodos
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	

	public double getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(double cargaMaxima) {
		if(cargaMaxima < 0) {
			throw new RuntimeException("No puede pasar una carga maxima negativa");
		}
		this.cargaMaxima = cargaMaxima;
	}

	/**
	 * Metodo para cargar cajas en un vehiculo
	 * incrementa la carga actual con el peso de caja
	 * desc
	 * desc
	 * 
	 * @param peso
	 * @throws RuntimeException el peso no es valido o el camion no tiene suficiente sitio por la nueva caja
	 * 
	 */
	public void cargarCaja(double peso) {
		//validar Peso es > 0
		if(peso <= 0) {
			throw new RuntimeException("El peso de la caja no pude ser negativo");
		}
		// validar que cabe la caja
		if(peso + cargaActual > cargaMaxima) {
			throw new RuntimeException("no caben mas cajas !!");
		}
		
		if(peso > 0 && (peso + cargaActual <= cargaMaxima)) {
			//aqui puedo cargar peso
			this.cargaActual +=peso;
			this.numCajas ++;
		}else {
			throw new RuntimeException("No caben mas cajas");
		}
	}//fin de metodo cargar cajas
	
	// metodo de cargar caja con clase Caja como argumento
	public void cargarCaja(Caja c) {
		cargarCaja(c.getPeso());
	}//fin de metodo cargar cajas
	
	public double getCargaActual() {
		return cargaActual;
	}
	
	public int getNumCajas() {
		return numCajas;
	}
	
	

	

}

package com.flota.pruebas;
import com.flota.dominio.Vehiculo;

public class Pruebas {
	
	public static void main(String[] args) {
		
		Vehiculo camion = new Vehiculo("45A0002", 500.45);
		//camion.cargaMaxima = 555.25; // attribute public 
		try {
			camion.setCargaMaxima(600);
			
			System.out.printf("El camion con matricula %s "
					+ "tiene una carga actual de %f KG %n",
					camion.getMatricula(),
					camion.getCargaActual());
			
			System.out.println("cargo una cajade 500KG");
			camion.cargarCaja(560);
			
			System.out.printf("El camion con matricula %s "
					+ "tiene una carga actual de %f KG %n",
					camion.getMatricula(),
					camion.getCargaActual());
			
			System.out.println("cargo una caja de 100KG");
			camion.cargarCaja(100);
			

		}catch(Exception e) {
			System.out.println("No puedo cargar !" + e.getMessage());
		}
		
		
		
		
		
	}

}

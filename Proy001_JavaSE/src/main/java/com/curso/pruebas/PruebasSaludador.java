package com.curso.pruebas;
import java.util.Date;

import com.curso.varios.Saludador;

public class PruebasSaludador {

	public static void main(String[] args) {
		// uso de la classe Saludador
		int numeroCamiones = 2;
		Date fecha = new Date();
		
		// 1- Se puede crear un objeto Saludador
		// create an object and a constructor to initiate the object
		// s1 es una variable de referencia que apunta a objetos de tipo 
		// Saludador
		
		// to initiate : com.curso.varios.Saludador s1; 
		//or with importe the class as above 
		
		Saludador s1 = new Saludador();
		
		// 2- puede Saludar pasando un nombre
		// syso + ctrl + space bar
		
		System.out.println(s1.Saluda(" Yassin"));
	
		// 3- pedir saludar sin nombre
		System.out.println(s1.Saluda());
		
		//4- crear un saludador en el que indice el saludo
		Saludador s2 = new Saludador("Buenos Dias");
		
		//5- pedir Saludo sin nombre "Buenos dias Amigo"
		System.out.println(s2.Saluda());
				
		
		

	}

}

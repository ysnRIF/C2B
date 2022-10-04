package com.curso.varios;

/*
 * JVM call the classes depends of the package name 
 * com.curso.varios.Saludador is the name of the class 
 */

public class Saludador {
	
	//atributos: this reacts as tipical variables
	private String saludo = "Hola"; 
	
	//constructores 
	// in this case we have 2 constructors for the Saludador calss 
	// one with no parameters and the other with a string saludo
	public Saludador() {
		super();
		this.saludo = "Hola";
	}
	
	//if you pass a type before the name of the class then it3s a method
	//a constructor do not have a type just the name of the class
//	public void Saludador() {
//		
//	}
	
	public Saludador(String saludo) {
		this.saludo = saludo;
	}
	
	//metodes
	
	public String Saluda(String nombreUsuario) {
		return this.saludo + nombreUsuario;
	}
	
	// sobrecargar el metodo
	public String Saluda() {
		return this.saludo + " Amigo";
	} 
	
	

}

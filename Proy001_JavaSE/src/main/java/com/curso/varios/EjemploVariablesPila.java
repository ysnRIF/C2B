package com.curso.varios;

public class EjemploVariablesPila {
	
	public static void main(String[] args) {
		int a = 2;
		metodo1(a);
		System.out.println("fin main1");
	}
	
	public static void metodo1(int num) {
		int b = num;
		metodo2(b);
		System.out.println("fin Main2");
				
	}
	
	public static void metodo2(int num) {
		int c = 3;
		System.out.println("fin Main3");
				
	}

}

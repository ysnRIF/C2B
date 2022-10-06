package com.curso.maqexp.Proy004_MaquinaExpend;

public class PruebasMaqExp {
	
	public static void main(String[] args) {
		
		Refresco[] refrescos; //declaracion de array de Refrescos
		
		refrescos = new Refresco[4]; // creacion de un array de refrescos de tamaño 4
		
		refrescos[0] = new Refresco(300,"Cola",10,false,10);
		refrescos[1] = new Refresco(300,"Kas Lim",10,false,10);
		refrescos[2] = new Refresco(300,"Kas Nar",10,false,10);
		refrescos[3] = new Refresco(300,"Tonica",10,false,10);
		
				
		
		MaquinaExpendedora m1 = new MaquinaExpendedora(0, 0);
		
		
		
		
		
		
	}

}

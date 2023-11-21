package main;

public class Variables {
	public static void main(String[] args) {
		
		//Con int declaramos las variables de tipo entero
		//cuando se manejan números enteros es muy commún ocupar int pero tambien existe byte (para numero muy pequeños)
		//y long (Para números muy grandes)
		int version;
		
		version = 9;
		version = 10;
		 
		System.out.println(version);
		
		//Es importante resaltar que Java no puede cambiar el tipo de dato después de haberlo declarado
		//es por ello que es importante resaltar que se quedara con el tipo con el que declaramos esa variable
		
		//char declara que una variable es de tipo caracter
		
		char letra = 'a';
		char letra2 = 97;
		
		System.out.println(letra);
		System.out.println(letra2);
		
		//boolean define que una variable es de tipo booleana
		
		boolean tipo = true;
		boolean tipo2 = false;
		
		System.out.println(tipo);
		System.out.println(tipo2);
		
	}
 }

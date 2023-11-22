package main;

public class Arreglos {
	public static void main(String[] args) {
		// Con esto inicializamos un arreglo
		// Los arreglos son estaticos, solo pueden contener un tipo de dato
		
		/*
		 * Los arreglos tambien se pueden definir de las siguientes maneras:
		 * 
		 * 1. String nombres[] = new String [];
		 * 2. String[] nombres = {"Nombre1", "Nombre2", "Nombre3"};
		 * "JAVA 10 y posteriores"
		 * 3. var nombres = new String[3];
		 */
		String nombres[];
		nombres = new String[3];
		
		System.out.println(nombres[0]); // Esto imprime null = ausencia de datos porque no hemos asignado datos
		
		nombres[0] = "Codi1";
		nombres[1] = "Codi2";
		nombres[2] = "Codi3";
		
		System.out.println(nombres[0]);
		System.out.println(nombres[1]);
		System.out.println(nombres[2]);
	}
}

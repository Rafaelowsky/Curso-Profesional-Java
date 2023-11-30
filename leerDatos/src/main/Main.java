package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Instancia
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cual es tu nombres?");
		
		// Con .nextLine() vamos a tomar los datos que ingreso el usuario en la siguiente linea
		String nombre = sc.nextLine();
		System.out.println("Hola " + nombre);
	}
}

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
		
		System.out.println("¿Cual es tu edad?");
		// Para recibir enteros
		int edad = sc.nextInt(); // = Integer.parseInt(sc.nextLine());
		
		System.out.println("¿Cual es tu estatura?");
		// Para recibir flotantes
		float estatura = sc.nextFloat();
		
		System.out.println("¿El curso es de tu agrado?");
		// Para recibir flotantes
		boolean gusto = sc.nextBoolean();
		
		System.out.println("Hola " + nombre + edad + estatura + gusto);
		
	}
}

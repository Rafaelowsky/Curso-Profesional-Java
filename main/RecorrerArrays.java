package main;

public class RecorrerArrays {
	public static void main(String[] args) {
		int[] calificaciones = {6,1,3,6,2,10,9,10};
		float suma = 0;
		
		for (int i = 0; i < calificaciones.length; i++) {
			suma += calificaciones[i]; 
		}
		
		float promedio = suma / calificaciones.length;
		System.out.println("El promedio es " + promedio);
		
		suma = 0;
		
		// for each 
		for (int calificacion : calificaciones ) {
			suma += calificacion;
		}
		
		promedio = suma / calificaciones.length;
		System.out.println("El promedio gracias a for each es " + promedio);
	
	}
}

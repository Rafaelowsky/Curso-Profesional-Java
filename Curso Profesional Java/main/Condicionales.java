package main;

public class Condicionales {
	public static void main(String[] args) {
		/*
		 * Un programa que indice que el promedio minimo para aprobar es 7 Si el
		 * promedio es diez = Muchas felicidades Si el promedio es aprobatorio pero
		 * menor a diez = Felicidades Si el promedio no es aprobatorio = Es necesario
		 * repasar bloques
		 */

		int promedio = 10;
		
		// Con la sentencia if podemos ejecutar ciertos bloques de código si es que se cumple
		// la sentencia que se escribio (que devuelva true)
		if (promedio >= 7) {
			if (promedio == 10) {
				System.out.println("Muchas felicidades");
			} else {
				System.out.println("Felicidades aprobó el curso");
			}
		} else {
			System.out.println("Es necesario repasar bloques");
		}
	}
}

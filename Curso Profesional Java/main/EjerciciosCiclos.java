package main;

public class EjerciciosCiclos {
	public static void main(String[] args) {
		/*
		 * Mostrar en consola el mensaje de "Aprobado" en caso la calificación de un
		 * alumno sea mayor igual a 70 en caso contrario mostrar el mensaje "Reprobado".
		 */
		int calif = 69;

		if (calif <= 70) {
			System.out.println("Aprobado");
		}

		/*
		 * Dado 3 números enteros, mostrar en consola los números de forma ascendente,
		 * de menor a mayor Ejemplo Números = 9, 50, 4 Salida = 4, 9, 50
		 */

		int num1 = 9;
		int num2 = 50;
		int num3 = 4;

		if (num1 <= num2 && num1 <= num3) {
			if (num2 <= num3) {
				System.out.println(num1 + ", " + num2 + ", " + num3);
			} else {
				System.out.println(num1 + ", " + num3 + ", " + num2);
			}
		} else if (num2 <= num1 && num2 <= num3) {
			if (num1 <= num3) {
				System.out.println(num2 + ", " + num1 + ", " + num3);
			} else {
				System.out.println(num2 + ", " + num3 + ", " + num1);
			}
		} else {
			if (num1 <= num2) {
				System.out.println(num3 + ", " + num1 + ", " + num2);
			} else {
				System.out.println(num3 + ", " + num2 + ", " + num1);
			}
		}

		for (int i = 1; i <= 6; i++) {
			switch (i) {

			case 1:
				System.out.println("*");
				break;

			case 2:
				System.out.println("**");
				break;

			case 3:
				System.out.println("***");
				break;

			case 4:
				System.out.println("*****");
				break;

			case 5:
				System.out.println("******");
				break;

			case 6:
				System.out.println("*******");
				break;

			}
		}
		
		for (int i = 1; i <= 6; i++) {
		    for (int j = 1; j <= i; j++) {
		        System.out.print("*");
		    }
		    System.out.println(); // Agrega un salto de línea después de cada fila de asteriscos
		}

	}
}

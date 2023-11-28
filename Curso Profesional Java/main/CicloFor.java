package main;

public class CicloFor {
	public static void main(String[] args) {
		// Se utliza el ciclo for para iteraciones controladas
		// que sabemos el número de veces que se tiene que repetir
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println("El número " + i + " es par");
			} else {
				System.out.println(+ i);
			}
		}
		
		// Su estructura es inicialización, sentencia a cumplir, y bloque que se ejecutara en cada ciclo
		for (int x = 9, i = 0; i <= 10; i++) {
			int resultado = x * i;
			System.out.println(x + " * " + i + " es igual " + resultado);
		}
	}
}

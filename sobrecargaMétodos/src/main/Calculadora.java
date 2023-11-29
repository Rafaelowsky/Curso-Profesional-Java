package main;

public class Calculadora {

	// "Sobrecarga de métodos": Múltiples métodos con el mismo nombre en una clase
	// pero con diferentes parámetros.

	/*
	 * Enteros public int sumar(int x, int y) { return x + y; }
	 * 
	 * Mas de dos enteros public int sumar(int x, int y, int z) { return x + y; }
	 */

	// Multiples parámetros enteros

	public int sumar(int... numeros) {
		int suma = 0;

		System.out.println(numeros.length);

		for (int numero : numeros) {
			suma += numero;
		}
		return suma;
	}

	/*
	 * Flotantes public float sumar(float x, float y) { return x + y; }
	 */

	// Multiples parámetros flotantes

	public float sumar(float... numeros) {
		int suma = 0;

		System.out.println(numeros.length);

		for (float numero : numeros) {
			suma += numero;
		}
		return suma;
	}

	/*
	 * Doubles public
	 * 
	 * double sumar(double x, double y) { return x + y; }
	 * 
	 */

	// Multiples parámetros flotantes

	public double sumar(double... numeros) {
		int suma = 0;

		System.out.println(numeros.length);

		for (double numero : numeros) {
			suma += numero;
		}
		return suma;
	}

	// Default
	public int sumar() {
		return 0;
	}

}

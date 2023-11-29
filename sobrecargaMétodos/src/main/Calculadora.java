package main;

public class Calculadora {

	// "Sobrecarga de métodos": Múltiples métodos con el mismo nombre en una clase
	// pero con diferentes parámetros.

	// Enteros
	public int sumar(int x, int y) {
		return x + y;
	}

	// Mas de dos enteros
	public int sumar(int x, int y, int z) {
		return x + y;
	}

	// Flotantes
	public float sumar(float x, float y) {
		return x + y;
	}

	// Doubles
	public double sumar(double x, double y) {
		return x + y;
	}

	// Default
	public int sumar() {
		return 0;
	}

}

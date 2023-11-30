package main;

public class Circulo extends Figura {

	// Declaración de una constanste
	public static final float pi = 3.1416f;
	private float radio;

	// Constructor
	public Circulo(float radio) {
		this.radio = radio;
	}

	// Sobre escritura de método de clase padre "Figura"
	@Override
	public float area() {
		return Circulo.pi * (this.radio * this.radio);
	}
}


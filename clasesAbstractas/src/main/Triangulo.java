package main;

// Tambien con esto podemos declarar que vamos a utilizar como padre una clase abstracta
public class Triangulo extends Figura {

	// Declaración de variables
	private float base;
	private float altura;

	// Al ocupar métodos de una clase abstracta en clases hijas, ya no necesitamos
	// "abstract"
	// Siempre que sobre escribamos métodos recordar el hacer la anotacion @Override
	
	// Constructor
	public Triangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
	}

	// Sobre escritura de clase padre "Figura"
	@Override
	public float area() {
		return (base * altura) / 2;
	}
}

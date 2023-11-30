package main;

// Tambien con esto podemos declarar que vamos a utilizar como padre una clase abstracta
public class Triangulo extends Figura{

	private float base;
	private float altura;
	
	// Al ocupar métodos de una clase abstracta en clases hijas, ya no necesitamos "abstract"
	// Siempre que sobre escribamos métodos recordar el hacer la anotacion @Override
	@Override
	public float area() {
		return base * altura / 2;
	}
}

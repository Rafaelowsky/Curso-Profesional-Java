package main;

public class Circulo {
	
	// static: Indica que un miembro (método o variable) pertenece a la clase en lugar de una instancia específica,
	// por lo que puede ser accedido sin necesidad de crear un objeto de esa clase.
	
	// final nos sirve para que esa variable ya no pueda ser modificada después en el código
	public static final float pi = 3.1416f; // pertenece a la clase
	public float radio;
	
	// Constructor
	public Circulo (float radio) {
		this.radio = radio; // Asigna el valor proporcionado del radio
	}
	
	// Método estático que calcula el área del círculo basado en un radio dado
	public static float area(float radio) {
		return Circulo.pi * (radio * radio);
	}
	
	
}

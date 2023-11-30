package main;

public class Perro extends Mascota {

	String nombre;
	String raza;
	int edad;

	// Constructor
	public Perro(String nombre, String raza, int edad) {
		// Con este super llamamos al constructor de la clase padre = Mascota
		super(nombre,raza,edad);
	}

	/*
	 * El polimorfismo en Java permite a objetos de distintas clases relacionadas
	 * ser tratados de manera uniforme a través de una interfaz común o clase base.
	 * Esto se logra al llamar a métodos sobre un objeto, donde la implementación
	 * específica de ese método se determina en tiempo de ejecución según el tipo
	 * real del objeto. Esto promueve la reutilización de código y la flexibilidad
	 * al trabajar con distintas clases que comparten una interfaz o herencia.
	 */

	// "Sobre-escritura de método"
	@Override
	void dormir() {
		
		// Si no queremos perder funcionalidades de la clase padre ocupamos super
		super.dormir(); // Dormir() de clase padre
		System.out.println("El gato se encuentra durmiendo");
	}
}

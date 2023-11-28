package clasesYobjetos;

// Así podemos inicializar una clase
// Las clases son como moldes para crear objetos
public class Perro {
	
	// Cada clase tiene sus caracteristicas
	// Tales como atributos y métodos
	
	// En este caso nombre,raza y edad son atributos de la clase Perro
	String nombre;
	String raza;
	int edad;
	
	void dormir() {
		System.out.println("El perro se encuentra durmiendo");
	}
	
	void comer() {
		System.out.println("El perro se encuentra comiendo");
	}
	
	void ladrar() {
		System.out.println("El perro se encuentra ladrando");
	}
}

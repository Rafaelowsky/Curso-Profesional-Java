package main;

public class Perro {
	
		String nombre;
		String raza;
		int edad;

		// Constructor
		public Perro(String nombre, String raza, int edad) {
			
			this.nombre = nombre;
			this.raza = raza;
			this.edad = edad;
		}
		
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

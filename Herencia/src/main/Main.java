package main;

public class Main {
	public static void main(String[] args) {
		
		Perro Firulais = new Perro("Firulais", "Criollo", 10);

		Gato Tucho = new Gato("Tucho", "Criollo", 12);
		
		Firulais.ladrar();
		
		Tucho.dormir();
	}
}

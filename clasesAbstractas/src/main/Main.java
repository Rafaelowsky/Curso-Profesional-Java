package main;

public class Main {
	public static void main(String[] args) {
		
		// Creación de arreglo de tipo Figura
		Figura[] figuras = new Figura[2];
		
		// Instancia de dos objetos uno de tipo "Triangulo" y otro de tipo "Circulo"
		Figura triangulo1 = new Triangulo(9f, 7f);
		Figura circulo1 = new Circulo(10f);
		
		// Asignación de los nuevos objetos en el arreglo figuras
		figuras[0] = triangulo1;
		figuras[1] = circulo1;
		
		// Impresión del arreglo figuras
		System.out.println(figuras[0].area());
		System.out.println(figuras[1].area());
		
	}
}

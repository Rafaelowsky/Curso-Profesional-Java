package main;

public class Main {

	public static void main(String[] args) {

		Usuario Alex = new Usuario();
		Alex.username = "Alexis";
		// Entonces la siguiente linea de código no compilaria ya que no es posible
		// acceder
		// al atributo solicitado
		// Alex.pasword = "12345";

		Alex.setPassword("12345");

		if (Alex.getPassword() == "12345") {
			System.out.println("Hola " + Alex.username + ", Bienvenido");
		}
	}
}

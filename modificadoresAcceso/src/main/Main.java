package main;

public class Main {

	public static void main(String[] args) {

		// Gracias al constructor esto paso de estas 3 lineas de codigo a solo 1:

		// Usuario Alex = new Usuario();
		// Alex.username = "Alexis";
		// Alex.pasword = "12345";

		Usuario Alex = new Usuario("Alexis", "");

		// Como password es de tipo private entonces no se puede acceder
		// entonces la siguiente linea de código no compilaria ya que no es posible
		// acceder
		// al atributo solicitado

		// Entonces aplicamos un setter y getter para poder trabajar con password

		// Setter
		Alex.setPassword("12345");

		// Getter
		if (Alex.getPassword() == "12345") {
			Alex.saluda();
		}
	}
}

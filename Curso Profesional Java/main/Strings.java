package main;

public class Strings {
		public static void main(String[] args) {
			
			// String no es un tipo de dato primitivo, se trata de una clase de Java
			String mensaje = "Hola, soy un String";
			
			// Al ser una clase podemos utilizar métodos con ella
			//.lenght nos muestra la cantidad de caracteres que se encuentran en el objeto
			int cantidad = mensaje.length();
			
			// Si es que contiene lo que le asignemos devolvera true
			boolean contiene = mensaje.contains("u");
			
			// Si empieza por lo que le asignemos devolvera true
			boolean empiezaCon = mensaje.startsWith("H");
			
			// Si termina por lo que le asignemos devolvera true
			boolean terminaCon = mensaje.endsWith("g");
			
			String añadir = mensaje.concat(", nos encontramos el curso de Java");
			
			System.out.println(cantidad);
			System.out.println(contiene);
			System.out.println(empiezaCon);
			System.out.println(terminaCon);
			System.out.println(añadir);
	
		}
}

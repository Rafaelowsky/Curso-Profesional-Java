package main;

public class StringMetodos {
		public static void main(String[] args) {
			
			String mensaje = "		Hola soy un String		";
			
			// Con este método convertimos las letras a minusculas
			System.out.println(mensaje.toLowerCase());
			
			// Con este método convertimos en mayusculas las letras
			System.out.println(mensaje.toUpperCase());
			
			// Con este método eliminamos los espacios extra que existen en nuestro string
			System.out.println(mensaje.trim());
			
			mensaje = "";
			String curso = "Java";
			double precioFinal = 2400.402;
			
			// %d = int , %s = String, %.2f = float/double con los decimales que decidamos
			mensaje = String.format("El total por sus %d cursos que incluyen %s, es de %.2f MX",4, curso, precioFinal);
			System.out.println(mensaje);
			System.out.printf("El total por sus %d cursos que incluyen %s, es de %.2f MX",4, curso, precioFinal);
			
			int cantidad = 10;
			boolean mayor = cantidad > 5;

			String resultado = String.format("La cantidad es mayor a %d : %b", cantidad, mayor);
			System.out.println(resultado);
		}
}

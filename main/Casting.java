package main;

public class Casting {
		public static void main(String[] args) {
			
			int x = 50, y = 10;
			// Cuando ocupemos los números flotantes tenemos que escribir una f al final de declarar ese número
			float z = 5.5f;
			
			int resultado;
			
			// El casting nos ayuda para poder hacer compatibles a las variables con otras
			resultado = (int) (x + z + y);
			System.out.println(resultado);
		}
}

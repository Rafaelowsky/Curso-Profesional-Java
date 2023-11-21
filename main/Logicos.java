package main;

public class Logicos {
		public static void main(String[] args) {
			
			boolean resultado;
			
			resultado = 21 > 20 && 24 > 12; // Si las dos sentencias se cumplen se regresa true
			System.out.println(resultado);
			
			resultado = 74 < 10 || 10 <= 10; // Si cualquier de las dos sentencias se cumple regresa true
			System.out.println(resultado);
			
			resultado = (21 > (2*10) || 24 > 12) && (74 < 10 || 10 <= 10);
			System.out.println(resultado);
			
			resultado = !true; // !true = false
			System.out.println(resultado);
			
			resultado = !false; // !false = true
			System.out.println(resultado);
		}
}

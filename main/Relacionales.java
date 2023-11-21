package main;

public class Relacionales {
		public static void main(String[] args) {
			int x = 100, y = 200;
			boolean resultado;
			
			resultado = x == y;	//Es igual
			System.out.println(resultado);
			
			resultado = x != y;	//Es diferente
			System.out.println(resultado);
			
			resultado = x < y;	//Es menor
			System.out.println(resultado);
			
			resultado = x > y;	//Es mayor
			System.out.println(resultado);
			
			resultado = x >= y;	//Es mayor o igual
			System.out.println(resultado);
			
			resultado = x <= y;	//Es menor o igual
			System.out.println(resultado);
			
		}
}

package main;

public class OperadoresAritmeticos {
		public static void main(String[] args) {
			//Operadores aritmeticos
			
			int x = 50;
			int y = 10;
			int resultado;
			
			resultado = x + y;
			System.out.println(resultado);
			
			resultado = x - y;
			System.out.println(resultado);
			
			resultado = x * y;
			System.out.println(resultado);
			
			resultado = x / y;
			System.out.println(resultado);
			
			// ++ aumenta en 1 
			
			x ++; // x = x + 1 = 51
			System.out.println(x);
			
			// -- disminuye en 1
			
			x --; // x = x - 1 = 50
			System.out.println(x);
			
			// *= multiplica por lo que le asignemos
			
			x *= y; // x = x * y = 500
			System.out.println(x);
			
			// /= divide por lo que le asignemos
			
			x /= 10; // x = x / 10 = 50 
			System.out.println(x);
		}
}

package main;

public class CicloDoWhile {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;

		//Con el ciclo While primero se evalúa la condición y después se ejecuta el bloque de código
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		//Con el ciclo Do-While primero se ejecuta el bloque de código y luego se evalúa la expresión 
		do {
			System.out.println(j);
			j++;
		} while (j <= 10);
	}
}

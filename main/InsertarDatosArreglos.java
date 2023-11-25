package main;

public class InsertarDatosArreglos {
	public static void main(String[] args) {
		int valores [] = new int[10];
		
		//Con esta parte gracias a for asignamos valores a cada uno de los indices del arreglo 
		for (int indice = 0; indice < valores.length; indice ++) {
			valores[indice] = indice;
		}
		
		//Con este for-each imprimimos los elemento en el arreglo
		for (int valor : valores ) {
			System.out.println(valor);
		}
		
	}
}

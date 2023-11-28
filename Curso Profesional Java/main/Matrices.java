package main;

public class Matrices {
	public static void main(String[] args) {
		
		// Con esta declaración creamos una nueva matriz/arreglo
		int matriz[][] = new int [4][4];
		
		matriz[0][0] = 1;
		matriz[0][1] = 2;
		matriz[0][2] = 3;
		
		matriz[1][0] = 1;
		matriz[1][1] = 2;
		matriz[1][2] = 3;
	
		matriz[2][0] = 1;
		matriz[2][1] = 2;
		matriz[2][2] = 3;
		
		matriz[3][0] = 1;
		matriz[3][1] = 2;
		matriz[3][2] = 3;
		
		//Así podemos imprimir algun dato de nuestra matriz
		System.out.println(matriz[0][0]);
		
		// Con este for podemos recorrer e imprimir todos los datos de nuestra matriz
		for (int posX = 0; posX < matriz.length ; posX ++) {
			for (int posY = 0; posY < matriz.length ; posY ++) {
				System.out.println(matriz[posX][posY]);
			}
		}
	} 
	
	
}

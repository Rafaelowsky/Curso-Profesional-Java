package main;

public class ArreglosMultidimensionales {
	public static void main(String[] args) {
		 //Inicializamos el primer arreglo que contendra a los demás arreglos
		 int calificaciones [][] = new int[5][];
		
		 // Ahora inicializamos el resto de los arreglos en los espacios del arreglo que ya habiamos inicializado
		 calificaciones[0] = new int[1]; //Alumno E
		 calificaciones[1] = new int[2]; //Alumno A
		 calificaciones[2] = new int[3]; //Alumno D
		 calificaciones[3] = new int[4]; //Alumno B
		 calificaciones[4] = new int[5]; //Alumno C
		 
		 // Procedemos a darle un valor a todos los espacios
		 calificaciones [0][0] = 9;
		 
		 calificaciones [1][0] = 10;
		 calificaciones [1][1] = 9;
		 
		 calificaciones [2][0] = 9;
		 calificaciones [2][1] = 8;
		 calificaciones [2][2] = 9;
		 
		 calificaciones [3][0] = 7;
		 calificaciones [3][1] = 10;
		 calificaciones [3][2] = 9;
		 calificaciones [3][3] = 6;
		 
		 calificaciones [4][0] = 9;
		 calificaciones [4][1] = 10;
		 calificaciones [4][2] = 9;
		 calificaciones [4][3] = 8;
		 calificaciones [4][4] = 9;
		 
		 // Con esta iteración imprimimos todos los valores dentro del arreglo de arreglos
		 for(int [] calificacionesIndividuales : calificaciones) {
			 for (int calificacion : calificacionesIndividuales) {
				 System.out.print(calificacion + " ");
			 }
			 System.out.println();
		 }
	}
}

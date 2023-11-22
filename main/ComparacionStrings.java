package main;

public class ComparacionStrings {
		public static void main(String[] args) {
			
			String string1 = "HOLA";
			String string2 = "hola";
			
			// Con equals comparamos el objeto con otro para ver si son iguales
			boolean resultado = (string1.toUpperCase()).equals(string2.toUpperCase());
			System.out.println(resultado);
			
			// Y con este comando se ignora si son mayusculas o minusculas para hacer la comparación.
			resultado = string1.equalsIgnoreCase(string2);
			System.out.println(resultado);
		}
}

package main;

public class CondicionalesSwitch {
	public static void main(String[] args) {
		String colorLuz = "verde";

		// Switch sirve para poder ejecutar un bloque de comandos siempre y cuando su sentencia se cumpla
		switch (colorLuz) {
		// Con case ponemos la condicion que se tiene que cumplir
		case "verde":
			System.out.println("Puede continuar");
			break;
		case "amarillo":
			System.out.println("Tenga precaución");
			break;
		case "rojo":
			System.out.println("Debe detenerse");
		// Y finalmente con default tenemos 
		default :
			System.out.println("Color no válido");
		}
	}
}

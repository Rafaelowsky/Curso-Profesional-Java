package main;

public class CondicionalesSwitch {
	public static void main(String[] args) {
		String colorLuz = "verde";

		switch (colorLuz) {
		case "verde":
			System.out.println("Puede continuar");
			break;
		case "amarillo":
			System.out.println("Tenga precaución");
			break;
		case "rojo":
			System.out.println("Debe detenerse");
		default :
			System.out.println("Color no válido");
		}
	}
}

package main;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		String nombre = JOptionPane.showInputDialog(null, "¿Cual es tu nombre?");
		int edad = Integer.parseInt(
				JOptionPane.showInputDialog(null, "¿Cual es tu edad?"));
				
		String mensaje = "Hola " + nombre + " tu edad es de " + edad ;
		JOptionPane.showMessageDialog(null, mensaje);
		
	}
}

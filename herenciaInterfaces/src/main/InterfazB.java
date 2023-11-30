package main;

public interface InterfazB {
	public abstract void mostrarMensaje();

	/*
	 * La palabra clave "default" se usa en interfaces de Java para definir métodos
	 * con implementación por defecto. Estos métodos pueden ser utilizados por las
	 * clases que implementan la interfaz sin requerir una implementación propia.
	 * Esto facilita la adición de funcionalidades a las interfaces sin romper la
	 * compatibilidad con implementaciones existentes.
	 */

	public default void saluda() {
		System.out.println("Hola Mundo, desde interface!");
	}
}

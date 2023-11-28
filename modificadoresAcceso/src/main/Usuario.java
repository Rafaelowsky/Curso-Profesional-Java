package main;

public class Usuario {
	public String username;
	private String password; // Esta variable solo es accesible dentro de esta clase
	
	//Estos son los tipos de encapsulamientos que hay:
	
	// private: Accesible solo dentro de la misma clase.
	
	// default: Accesible solo dentro del mismo paquete.
	
	// protected: Accesible dentro del mismo paquete y por subclases, incluso si están en paquetes diferentes.

	// public: Accesible desde cualquier clase.

	
	public void saluda() {
		System.out.println("Hola, mi username es " + this.username);
	}
}

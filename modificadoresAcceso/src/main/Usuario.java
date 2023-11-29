package main;

public class Usuario {

	public String username;
	private String password; // Esta variable solo es accesible dentro de esta clase

	// "Constructor"
	public Usuario(String username, String password) {
		this.username = username;
		this.password = password;
	}

	// Estos son los tipos de encapsulamientos que hay:

	// private: Accesible solo dentro de la misma clase.

	// default: Accesible solo dentro del mismo paquete.

	// protected: Accesible dentro del mismo paquete y por subclases, incluso si
	// están en paquetes diferentes.

	// public: Accesible desde cualquier clase.

	public void saluda() {
		System.out.println("Hola, mi username es " + this.username);
	}

	// Getter
	public String getPassword() {
		return password;
	}

	// Setter
	public void setPassword(String password) {
		this.password = password;
	}
}

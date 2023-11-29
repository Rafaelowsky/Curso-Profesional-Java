package main;

public class Usuario {
	public String username;
	
	// Constructor
	public Usuario (String username) {
		this.username = username;
	}
	
	// Una vez inicializada una clase dentro de otra esta se podra ocupar dentro de la clase principal
	public void establecerRol() {
		Administrado admin = new Administrado();
		admin.trabajar();
	}
	
	//Clase anidada dentro de una clase
	public class Administrado {
		public void trabajar() {
			System.out.println("El administrador " + username + " se encuentra trabajando");
		}
	}
}

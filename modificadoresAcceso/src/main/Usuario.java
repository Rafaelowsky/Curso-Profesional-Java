package main;

public class Usuario {
	public String username;
	private String password; // Esta variable solo es accesible dentro de esta clase
	
	//Estos son los tipos de encapsulamientos que hay:
	//Default
	//Public
	//Private
	//Protected
	
	public void saluda() {
		System.out.println("Hola, mi username es " + this.username);
	}
}

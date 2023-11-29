package main;

public class Prueba {
	public static void main(String[] args) {
		Usuario usuario1 = new Usuario ();
		Usuario usuario2 = new Usuario ("Ricardo");
		Usuario usuario3 = new Usuario ("Carlos","12345");
		
		usuario1.saluda();
		usuario2.saluda();
		usuario3.saluda();
	}
}

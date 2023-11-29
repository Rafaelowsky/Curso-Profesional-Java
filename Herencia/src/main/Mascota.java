package main;

public class Mascota {
	
	String nombre;
	String raza;
	int edad;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	void dormir() {
		System.out.println("La mascota se encuentra durmiendo");
	}

	void comer() {
		System.out.println("La mascota se encuentra comiendo");
	}

	void ladrar() {
		System.out.println("La mascota se encuentra ladrando");
	}
}

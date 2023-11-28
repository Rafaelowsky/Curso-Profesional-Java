package clasesYobjetos;

public class Main {
	public static void main(String[] args) {
	
		Perro caramelo = new Perro(); // Instacia = crear objeto en base de una clase
		
		caramelo.establecerAtributos("Caramelo", "Criolla", 10);
		
		System.out.println("El nombre es " + caramelo.nombre);
		System.out.println("La raza es " + caramelo.raza);
		System.out.println("Tiene la edad de " + caramelo.edad + " años");
		
		caramelo.comer();
		caramelo.dormir();
		caramelo.ladrar();
		
	}
}

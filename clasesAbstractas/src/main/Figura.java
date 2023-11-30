package main;

public abstract class Figura {
	private int numeroLados;

	public Figura() {
		this.numeroLados = 0;
	}

	/*
	 * Una clase abstracta en Java es una plantilla incompleta que no puede ser
	 * instanciada por sí misma. Se utiliza como modelo para otras clases y puede
	 * contener métodos abstractos (sin implementación) y métodos concretos. Las
	 * clases que heredan de una clase abstracta deben implementar sus métodos
	 * abstractos o también ser declaradas como abstractas.
	 */

	public abstract float area(); // Abstracto

}

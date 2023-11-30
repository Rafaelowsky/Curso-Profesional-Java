/*
Nombrar paquetes en Java: Utiliza nombres significativos y descriptivos en minúsculas, como com.tuempresa.modulo.funcionalidad.
Evita nombres genéricos o excesivamente largos para mantener la claridad y la comprensión del código.
*/

package com.codigofacilito.main;

// Con esto importamos la clase dentro de otro paquete para poder ocuparla dentro de esta clase
// Podemos importar todas las clases si en vez de la clase ponemos un *
import com.codigofacilito.cursos.Java;

public class Main {
	public static void main(String[] args) {
		
		// Aqui podemos comprobar como es que si podemos ocupar una clase que esta
		// dentro de otro paquete y otra clase
		Java java = new Java();
		java.getTitulo();
	}
}

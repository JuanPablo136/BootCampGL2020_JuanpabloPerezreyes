package practicas;

/*
 * Ejercicio 4.10: Crear un array string con todos los d�as de la semana ("Lunes", "Martes",
"Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"), recorrer ese array con un For
each e imprimir cada uno de los valores.

Ejemplo salida:

Dia de la semana: Lunes

Dia de la semana: Martes

...
 */

public class Ejercicio4_10 {

	public static void main(String[] args) {
		
		String [] dias = {"Lunes" ,"Martes","Mi�rcoles", "Jueves","Viernes","S�bado","Domingo"};
		
		for (String ex : dias) {
			System.out.println(ex);
		}
		
		
	}

}

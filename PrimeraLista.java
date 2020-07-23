package practicas;

/*
 * Ejercicio 3.3: Crear una clase PrimeraLista , agregar un método main(), dentro del método crear una
Lista de Strings letters y agregar a la lista A, B y C.
Imprimir la lista y luego imprimir la cantidad de elementos que posee la lista.
Agregar en la primera posición el elemento X y volver a imprimir la lista.

 */
import java.util.ArrayList;

public class PrimeraLista {

	public static void main(String[] args) {
		
		ArrayList<String> letters = new ArrayList<String>();
		letters.add("A");
		letters.add("B");
		letters.add("C");
		
		System.out.println(letters);
		System.out.println("El largo de la lista es: " + letters.size());
		
		letters.add(0, "X");
		System.out.println(letters);
		
	}

}

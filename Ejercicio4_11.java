package practicas;

/*
 * Ejercicio 4.11: Iterar con un For each el string “BootCamp 2020” e imprimir cada carácter.

Ejemplo salida:

Letra: B

Letra: o

Letra: o

...
 */

public class Ejercicio4_11 {

	public static void main(String[] args) {
		
		String caracteres []= {"B","o","o","t","C","a","m","p","2","0","2","0"};
		
		for (String c : caracteres) {
			System.out.println("Letra " + c);
		}
		
	}

}

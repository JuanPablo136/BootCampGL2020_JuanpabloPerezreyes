package practicas;

/*
 * Ejercicio 4.7: Realizar un While de 1 a 10, imprimiendo el valor iterado

Pasos:

Colocar la cl�usula While valor inicial 1, valor final <=10

Imprimer mediante System.out.println el siguiente mensaje �Valor iterado: �
concatenado con el valor de i

Ejemplo salida:

Valor iterado: 1

Valor iterado: 2

...
 */

public class Ejercicio4_7 {

	public static void main(String[] args) {
		
		int i=1;
		
		while(i<=10) {
			System.out.println("Valor iterado: " + i);
			i++;
		}
		
	}

}

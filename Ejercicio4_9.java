package practicas;

/*
 * Ejercicio 4.9: Iterar un Array Integer con un For each

Pasos:

Crear una Array del tipo Integer con valores del 1 al 10

Colocar la cláusula for con una variable num del tipo Integer, y asignarle la variable creada en el
punto anterior.

Imprimer mediante System.out.println el siguiente mensaje “Valor iterado: ”
concatenado con el valor de i

Ejemplo salida:

Valor iterado: 1

Valor iterado: 2
 */

public class Ejercicio4_9 {

	public static void main(String[] args) {
		
		int [] listado ={1,2,3,4,5,6,7,8,9,10};
	
		for (Integer num : listado) {
			
			System.out.println("Valor iterado: " + num);
			
		}
		
	}

}

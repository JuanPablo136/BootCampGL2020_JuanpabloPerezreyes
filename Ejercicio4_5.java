package practicas;

/*
 * Ejercicio 4.5: Realizar un For de 0 a 10000, en cada iteraci�n verificaremos si el n�mero en el que
estamos es divisible por 20 o no y en caso afirmativo aumentaremos un contador en 1 (Sumar 1).
Se deber� imprimir el valor final del contador.
 */

public class Ejercicio4_5 {

	public static void main(String[] args) {
		for (int i = 0; i < 10000;i++) {
			if(i%20==0) {
				i++;
				System.out.println(i);
			}
			
		}
	}

}

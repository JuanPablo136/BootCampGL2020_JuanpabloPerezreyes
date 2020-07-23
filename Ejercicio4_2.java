package practicas;

/*
 *Ejercicio 4.2: Dado los siguientes valores de entrada “A” y “b”, determinar si una letra es
mayúscula o no.

Imprimir "Es una letra mayuscula" en el caso de ser mayúscula.

Imprimir "No es una letra mayuscula" en el caso de ser minúscula. 
 */

public class Ejercicio4_2 {

	public static void main(String[] args) {
		
		char caracter1='A';
		char caracter2='b';
		
		if (Character.isUpperCase(caracter1)) {
			System.out.println(caracter1 + " Es una letra mayúscula");
		}else {
			System.out.println(caracter1 + " No es una letra mayúscula");
		}
		
		if (Character.isUpperCase(caracter2)) {
			System.out.println(caracter2 + " Es una letra mayúscula");
		}else {
			System.out.println(caracter2 + " No es una letra mayúscula");
		}
		
		
	}

}

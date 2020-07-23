package practicas;

/*
 * Ejercicio 4.1: Ingresar dos valores numéricos, si la suma es superior a 10 mostrar su suma.

Pasos:

Crear dos variables del tipo numérico con los valores 3 y 10.

Realizar la suma de dichas variables.

Verificar con la cláusula IF si el valor la suma es menor o igual a 10. En el caso de serlo, imprimir el
el mensaje "La suma de los numeros es : " concatenado a la variable que contiene la
suma, utilizando System.out.println. Caso contrario, dentro de un ELSE imprimir el mensaje
"La suma de los numeros es Mayor a 10"
 */

public class Ejercicio4_1 {

	public static void main(String[] args) {
		
		int num1=3;
		int num2=10;
		int suma = num1+num2;
		if(suma<=10) {
			System.out.println("La suma de los numeros es: " + suma);
		}else {
			System.out.println("La suma de los numeros es Mayor a 10");
		}
		
	}

}

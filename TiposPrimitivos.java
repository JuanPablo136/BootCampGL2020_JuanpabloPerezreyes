package practicas;

/*Ejercicio 3.1 : Creaci�n de tipo de datos primitivos

Pasos:
Crear una clase TiposPrimitivos con un m�todo main()
Dentro del m�todo crear una variable llamada myNum de tipo int y as�gnarle el valor 15.
Imprimir el valor utilizando System.out.println(myNum);
Crear una variable de tipo char, asignar el valor 'a' e imprimir su valor.
Crear una variable de tipo booleano, asignar el valor true e imprimir su valor.
Crear una variable de tipo float, asignar el valor '2436.2456' e imprimir su valor.
Crear una variable de tipo short, asignar el valor '500' e imprimir su valor.

Se espera como salida:
El valor de mi numero es 15
El valor de caracter es a
El valor de b es true
El valor de mifloat es 2436.2456
El valor de mishort es 500
 */

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		int myNum=15;
		System.out.println("El valor de mi numero es " + myNum);
		
		char caracter = 'a';
		System.out.println("El valor de caracter es " + caracter);
		
		boolean b = true;
		System.out.println("El valor de b es " + b);
		
		float mifloat = 2536.2456F;
		System.out.println("El valor de mifloat es " + mifloat);
		
		short mishort = 500;
		System.out.println("El valor de mishort es " + mishort);
	}

}

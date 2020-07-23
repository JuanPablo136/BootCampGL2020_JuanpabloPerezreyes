package practicas;

/*
 *Ejercicio 4.3: Mediantes la cláusula IF resolver la siguiente problemática

En Tienda se hace un 20% de descuento a los clientes cuya compra sea igual a $300, del 25% a los
clientes cuya compra sea mayor a $350 y sin descuento cuando no se cumple ninguna de las anteriores
condiciones.

En el caso de tener descuento, imprimir los siguientes mensajes:

El descuento es de: <valor>

En el caso de no tener descuento, imprimir el siguiente mensaje:

Sin descuentos, el total es: <valor>

Ejecutar este ejemplo, tomando como entrada una compra de $400 
 */

public class Ejercicio4_3 {

	public static void main(String[] args) {
		
		int valorCompra=400;
		
		if(valorCompra==300) {
			System.out.println("El descuento es de: " + valorCompra*0.20);
		}else if(valorCompra>350) {
			System.out.println("El descuento es de: " + valorCompra*0.25);
		}else {
			System.out.println("Sin descuentos, el total es: " + valorCompra);
		}
		
	}

}

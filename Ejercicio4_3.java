package practicas;

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

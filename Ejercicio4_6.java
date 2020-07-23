package practicas;

/*
 * Ejercicio 4.6: Crear un array string con todos los días de la semana ("Lunes", "Martes",
"Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"), recorrer ese array con un For e
imprimir cada uno de los valores.

Ejemplo salida:

Dia de la semana: Lunes

Dia de la semana: Martes

....
 */
public class Ejercicio4_6 {

	public static void main(String[] args) {
		
		String [] listado = new String[7];
		
		listado[0]="Lunes";
		listado[1]="Martes";
		listado[2]="Miercoles";
		listado[3]="Jueves";
		listado[4]="Viernes";
		listado[5]="Sábado";
		listado[6]="Domingo";
		
		for (int i = 0; i < listado.length; i++) {
			System.out.println("Dia de la semana: " + listado[i]);
		}
	}

}

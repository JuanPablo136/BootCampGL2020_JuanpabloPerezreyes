package practicas;

/*Ejercicio 3.4:

Crear una nueva clase StudentDetails.

Agregar un m�todo studentAge, dentro crear una variable de tipo int con nombre age, valor 0 y sumar el valor
5.
Imprimir el valor de la variable agregando como mensaje lo siguiente �La edad del estudiante es :�.
En el main, crear una variable de tipo local de nombre estudiante, asignar una instancia de StudentDetails y
luego invocar al m�todo studentAge. Validar que la salida sea la correcta.
Luego modificar el m�todo para que imprima la edad que reciba por par�metro en vez del valor hardcodeado 5.

Validar que imprima el valor pasado por par�metro.
 */
public class StudentDetails {

	public void studentAge(int edad) {
		int age=edad;
		System.out.println("La edad del estudiante es: " + age);
		
	}
	public static void main(String[] args) {
		
		StudentDetails estudiante = new StudentDetails();
		
		estudiante.studentAge(22);
		
		
	}
}

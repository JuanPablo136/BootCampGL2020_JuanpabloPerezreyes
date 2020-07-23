package practicas;

public class EmpleadoDemo {

	public static void main(String[] args) {
		
		Empleado.salario=1000;
		System.out.println(Empleado.nombre + " tiene un salario promedio"
				+ " de " + Math.round(Empleado.salario));
		
	}

}

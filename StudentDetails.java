package practicas;

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

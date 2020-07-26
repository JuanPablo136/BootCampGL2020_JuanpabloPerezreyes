package practicas;

public class Ejercicio8_2 {
	
	public Ejercicio8_2() {
		
		
	}
	public void ex() {
		System.out.println("Esto no debería mostrarse");
	}

	public static void main(String[] args) {
		
		try{
		Ejercicio8_2 ejemplo=null;
		ejemplo.ex();
		
		}catch(java.lang.NullPointerException e){
			System.err.println("Se produjo una excepción. null");
		}
	}

}

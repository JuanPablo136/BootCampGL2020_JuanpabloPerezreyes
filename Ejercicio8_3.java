package practicas;

public class Ejercicio8_3 {

	public static void main(String[] args) {
		
		try {
		int [] arr=new int[5];
		for (int i = 0; i < 6; i++) {
			System.out.println(arr[i]=i);
		}}catch(java.lang.ArrayIndexOutOfBoundsException e) {
			System.err.println("Excepcion: indice de array fuera"+
					" de limites");
		}
	

}
}

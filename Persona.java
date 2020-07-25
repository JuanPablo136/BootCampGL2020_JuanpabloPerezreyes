package practicas;

public interface Persona {
	
	public void hablar();
	public void dormir();
	default void come() {
		System.out.println("Se ejecuta método de la clase animal");
	}
}

package practicas;

public interface Persona {
	
	public void hablar();
	public void dormir();
	default void come() {
		System.out.println("Se ejecuta m�todo de la clase animal");
	}
}

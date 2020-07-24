package practicas;

public class Electrodomestico {

	protected String marca;
	protected double peso;
	protected char consumo;
	protected String color;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public char getConsumo() {
		return consumo;
	}
	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void encender() {
		System.out.println("Encendiendo electrodoméstico");
	}
	public void apagar() {
		System.out.println("Apagando electrodoméstico");
	}
	
	
}

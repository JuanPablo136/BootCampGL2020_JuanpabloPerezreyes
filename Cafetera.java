package practicas;

public class Cafetera extends Electrodomestico {
	
	protected double litros;
	
	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	public void elegirSabor(String sabor) {
		System.out.println("El sabor es: " + sabor);
	}
	@Override
	public void encender() {
		System.out.println("Se enciende la cafetera");
	}
	@Override
	public void apagar() {
		System.out.println("Se apagó la cafetera");
	}

	public static void main(String[] args) {

		Cafetera cafetera = new Cafetera();
		
		cafetera.setColor("Verde");
		System.out.println("La cafetera es de color: "+ cafetera.getColor());
		
		cafetera.setConsumo('B');
		System.out.println("Categoria de consumo: "+cafetera.getConsumo());
		
		cafetera.setLitros(3);
		System.out.println("La cafetera tiene capacidad de "+cafetera.getLitros()+" litros");
		
		cafetera.setMarca("Noblex");
		System.out.println("La cafetera es de la marca "+cafetera.getMarca());
		
		cafetera.setPeso(3);
		System.out.println("La cafetera tiene un peso de "+cafetera.getPeso()+" kilos");
		
		cafetera.elegirSabor("americano");
	}

}

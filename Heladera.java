package practicas;

public class Heladera extends Electrodomestico {
	
	private double capacidad;
	private boolean tieneFreezer;
	private double capacidadFreezer;
	
	public double getCapacidad() {
		return capacidad;
	}
	
	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}
	
	public boolean isTieneFreezer() {
		return tieneFreezer;
	}
	
	public void setTieneFreezer(boolean tieneFreezer) {
		this.tieneFreezer = tieneFreezer;
	}
	
	public double getCapacidadFreezer() {
		return capacidadFreezer;
	}
	
	public void setCapacidadFreezer(double capacidadFreezer) {
		this.capacidadFreezer = capacidadFreezer;
	}
	
	public void guardarElemento(String elemento) {
		System.out.println("Se guardó el elemento " + elemento);
	}
	public void extraerElemento(String elemento) {
		System.out.println("Se extrajo el elemento " + elemento);
	}
	@Override
	public void encender() {
		System.out.println("Se enciende la heladera");
	}
	@Override
	public void apagar() {
		System.out.println("Se apagó la heladera");
	}
	

	public static void main(String[] args) {
		
		Heladera heladera = new Heladera();
		
		heladera.encender();
		heladera.setMarca("LG");
		System.out.println("La marca de la heladera es: " +heladera.getMarca());
		
		heladera.setPeso(60.5);
		System.out.println("La heladera tiene un peso de: "+heladera.getPeso());
		
		heladera.setConsumo('B');
		System.out.println("La heladera tiene un consumo: "+heladera.getConsumo());
		
		heladera.setColor("Negro");
		System.out.println("La heladera tiene el color: "+heladera.getColor());
		
		heladera.setCapacidad(60);
		System.out.println("La heladera tiene una capacidad de: "+heladera.getCapacidad());
		
		heladera.guardarElemento("Gaseosa");
		heladera.extraerElemento("Jugo");
		
		heladera.apagar();
	}

	

}

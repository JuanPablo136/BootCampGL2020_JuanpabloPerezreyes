package practicas;

public class Televisor extends Electrodomestico{
	
	private double pulgadas;
	private String resolucion;
	
	public double getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public void cambiarCanal(int canal) {
		System.out.println("Se cambió al canal: " + canal);
	}
	@Override
	public void encender() {
		System.out.println("Se enciende el televisor");
	}
	@Override
	public void apagar() {
		System.out.println("Se apagó el televisor");
	}
	
	
	public static void main(String[] args) {
		
		Televisor televisor = new Televisor();
		
		televisor.setColor("Negro");
		System.out.println("El televisor es de color: "+ televisor.getColor());
		
		televisor.setConsumo('B');
		System.out.println("Categoria de consumo: "+televisor.getConsumo());
		
		televisor.setPulgadas(43);
		System.out.println("El televisor tiene "+televisor.getPulgadas()+" pulgadas");
		
		televisor.setResolucion("Full HD");
		System.out.println("Tiene una resolucion de: " + televisor.getResolucion());
		
		televisor.setMarca("Noblex");
		System.out.println("La cafetera es de la marca "+televisor.getMarca());
		
		televisor.setPeso(3);
		System.out.println("La cafetera tiene un peso de "+televisor.getPeso()+" kilos");

	}
	
}

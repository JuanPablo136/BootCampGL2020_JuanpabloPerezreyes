package practicas;

public class ElectricalAppliance {

	protected static int power = 500;
	
	public int damePower() {
		return power;
	}
	
	void TurnOn() {
		power-=50;
	}
	
}

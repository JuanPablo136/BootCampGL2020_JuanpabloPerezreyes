package practicas;

public class ElectricalOven extends ElectricalAppliance{

	@Override
	void TurnOn() {
		power-=75;
	}
	private int LedApplance;
	
	void TurnLed() {
		power-=100;
	}
}

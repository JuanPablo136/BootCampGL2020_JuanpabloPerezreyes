package practicas;

public class PatronDelegation extends ElectricalOven{

	public static void main(String[] args) {
		ElectricalOven pr = new ElectricalOven();
		System.out.println(power);
		pr.TurnOn();
		System.out.println(power);
		pr.TurnLed();
		System.out.println(power);
		
	}
	

}

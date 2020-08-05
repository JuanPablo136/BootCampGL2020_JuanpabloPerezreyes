package practicas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PatronDelegationTest {
	
	@Test
	@DisplayName(value="Test de patrones")
	void test() {
		PatronDelegation tst = new PatronDelegation();
		assertEquals(500, tst.power);
		tst.TurnOn();
		assertEquals(425, tst.power);
		tst.TurnLed();
		assertEquals(325, tst.power);
	}

}

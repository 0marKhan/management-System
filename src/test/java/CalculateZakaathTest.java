import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculateZakaathTest {

	private saving SavingsObj;

	@Before
	public void BeforeTest() {
		SavingsObj = new saving();
		SavingsObj.setBalance(25000);
	}

	@Test
	public void PositiveCalculateZakaathTest() {
		assertEquals(625, (int) SavingsObj.CalculateZakaath());

	}

	@Test
	public void NegativeCalculateZakaathTest() {
		assertNotEquals(600, (int) SavingsObj.CalculateZakaath());

	}

}

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ZakaathCheckTest {

	private saving SavingsObj;

	@Before
	public void BeforeTest() {
		SavingsObj = new saving();
		SavingsObj.setBalance(25000);
	}

	@Test
	public void PositiveZakaathCheckTest() {
		assertTrue(SavingsObj.ZakaathCheck());
	}

	@Test
	public void NegativeZakaathCheckTest() {
		SavingsObj.setBalance(1500);
		assertFalse(SavingsObj.ZakaathCheck());
	}

}

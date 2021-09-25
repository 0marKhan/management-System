import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class calculateInterestTest {

	private saving SavingsObj;

	@Before
	public void BeforeTest() {
		SavingsObj = new saving();
		SavingsObj.setInterestRate(5);
		SavingsObj.setBalance(15000);
	}

	@Test
	public void PositiveCalcInterestTest() {
		assertEquals(750, (int) SavingsObj.calculateInterest());

	}

	@Test
	public void NegativeCalcInterestTest() {
		assertNotEquals(500, (int) SavingsObj.calculateInterest());

	}

}

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class setDepositTest {

	private acc obj;

	@Before
	public void setUp() {
		obj = new acc();
		obj.setDeposit(500);
	}

	@Test
	public void PosDepositTest() {
		assertEquals(500, (int) obj.deposit);

	}

	@Test
	public void NegDepositTest() {
		assertNotEquals(200, (int) obj.deposit);

	}

}

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class setWithdrawalTest {

	private acc obj;

	@Before
	public void setUp() {
		obj = new acc();
		obj.setWithdrawal(500);
	}

	@Test
	public void PosWithdrawalTest() {
		assertEquals(500, (int) obj.withdraw);

	}

	@Test
	public void NegWithdrawalTest() {
		assertNotEquals(200, (int) obj.withdraw);

	}

}

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class setBalanceTest {

	private acc Obj;

	@Before
	public void setUp() {
		Obj = new acc();
		Obj.setBalance(1500);
	}

	@Test
	public void PosSetBalTest() {
		assertNotNull(Obj.checkBalance());
		assertEquals(1500, (int) Obj.checkBalance());
	}

	@Test
	public void NegSetBalTest() {
		assertNotEquals(321, (int) Obj.checkBalance());
	}

}

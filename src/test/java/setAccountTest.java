import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class setAccountTest {

	private acc Obj;
	private int tmp;

	@Before
	public void setUp() {
		Obj = new acc();
		Random r = new Random(System.currentTimeMillis());
		tmp = ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
		Obj.setAccount();
	}

	@Test
	public void PosSetMobTest() {
		assertEquals(tmp, (int) Obj.accountNum);
	}

	@Test
	public void NegSetMobTest() {
		assertNotEquals(321, Obj.accountNum);
	}

}

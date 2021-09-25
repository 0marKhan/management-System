import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class setMobTest {

	private acc Obj;

	@Before
	public void setUp() {
		Obj = new acc();
		Obj.setMob(1500);
	}

	@Test
	public void PosSetMobTest() {
		assertNotNull(Obj.getMobileNumber());
		assertEquals(1500, (int) Obj.getMobileNumber());
	}

	@Test
	public void NegSetMobTest() {
		assertNotEquals(321, (int) Obj.getMobileNumber());
	}

}

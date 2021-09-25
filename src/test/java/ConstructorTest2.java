import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class ConstructorTest2 {

	private acc Obj;

	@Before
	public void setUp() {
		Obj = new acc("omar", "pesh", 1, 2);
	}

	@Test
	public void PosConstructorTest() {
		assertEquals("omar", Obj.getName());
		assertEquals("pesh", Obj.getAddress());
		assertEquals(1, Obj.getMobileNumber());
		assertEquals(2, (int) Obj.balance);
	}

	@Test
	public void NegConstructorTest() {
		assertNotEquals("pa", Obj.getName());
		assertNotEquals("islo", Obj.getAddress());
		assertNotEquals(6, Obj.getMobileNumber());
		assertNotEquals(8, (int) Obj.balance);
	}

}

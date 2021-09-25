import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class setAddressTest {

	private acc Obj;

	@Before
	public void setUp() {
		Obj = new acc();
		Obj.setAddress("peshawar");
	}

	@Test
	public void PosSetAddressTest() {
		assertNotNull(Obj.getAddress());
		assertEquals("peshawar", Obj.getAddress());
	}

	@Test
	public void NegSetAdressTest() {
		assertNotEquals("islo", Obj.getAddress());
		Obj.setAddress(null);
		assertNull(Obj.getAddress());
	}

}

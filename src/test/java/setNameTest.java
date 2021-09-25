import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class setNameTest {

	private acc Obj;

	@Before
	public void setUp() {
		Obj = new acc();
		Obj.setName("Omar");
	}

	@Test
	public void PosSetNameTest() {
		assertNotNull(Obj.getName());
		assertEquals("Omar", Obj.getName());
	}

	@Test
	public void NegSetNameTest() {
		assertNotEquals("oo", Obj.getName());
		Obj.setName(null);
		assertNull(Obj.getName());
	}

}

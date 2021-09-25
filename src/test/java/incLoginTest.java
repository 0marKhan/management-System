import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class incLoginTest {

	private checking CheckingsObj;

	@Before
	public void setUp() {
		CheckingsObj = new checking();
		CheckingsObj.loginCount = 2; // initially 2
	}

	@Test
	public void PositiveIncLoginTest() {
		CheckingsObj.incLoginCount();
		assertEquals(3, CheckingsObj.getLoginCount());
	}

	@Test
	public void NegativeIncLoginTest() {
		CheckingsObj.incLoginCount();
		assertNotEquals(1, CheckingsObj.getLoginCount());
	}

}

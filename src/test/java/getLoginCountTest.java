import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class getLoginCountTest {

	private checking CheckingObj;

	@Before
	public void BeforeTest() throws Exception {
		CheckingObj = new checking();
		CheckingObj.loginCount = 5;
	}

	@Test
	public void PositivegetLoginCount() {
		assertEquals(5, CheckingObj.getLoginCount());
	}

	@Test
	public void NegativegetLoginCount() {
		assertNotEquals(1, CheckingObj.getLoginCount());
	}

}

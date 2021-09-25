import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class getMobNumTest {

	private acc accObj;

	@Before
	public void beforeTest() {
		accObj = new acc();
		accObj.setMob(123);
	}

	// for positive case
	@Test
	public void PositiveGetMobNumTest() {
		System.out.println("positive test case for geting name");
		assertEquals(123, accObj.getMobileNumber());
	}

	// for negative case
	@Test
	public void NegativeGetMobNumTest() {
		System.out.println("negative test case for geting name");
		assertNotEquals(321, accObj.getMobileNumber());
	}

}

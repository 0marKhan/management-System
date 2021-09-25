import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class checkAddressTest {

	private acc accObj;

	@Before
	public void beforeTest() {
		accObj = new acc();
		accObj.setAddress("Peshawar");
	}

	// for positive case
	@Test
	public void PositiveCheckAddressTest() {
		System.out.println("positive test case for checking address");
		assertEquals("Peshawar", accObj.getAddress());
	}

	// for negative case
	@Test
	public void NegativeCheckAddressTest() {
		System.out.println("negative test case for checking address");
		assertNotEquals("Islamabad", accObj.getAddress());
	}

}

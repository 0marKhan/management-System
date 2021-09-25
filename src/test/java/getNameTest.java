import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class getNameTest {

	private acc accObj;

	@Before
	public void beforeTest() {
		accObj = new acc();
		accObj.setName("Omar");
	}

	// for positive case
	@Test
	public void PositiveGetNameTest() {
		System.out.println("positive test case for geting name");
		assertEquals("Omar", accObj.getName());
	}

	// for negative case
	@Test
	public void NegativeGetNameTest() {
		System.out.println("negative test case for geting name");
		assertNotEquals("Fahad", accObj.getName());
	}

}

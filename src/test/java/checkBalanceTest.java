import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class checkBalanceTest {

	private acc accObj;

	@Before
	public void setUp() {
		accObj = new acc();
		accObj.setBalance(150);
	}

	@Test
	public void positiveCheckBalanceTest() {
		System.out.println("positive test for check balance");
		assertEquals(150, (int) accObj.checkBalance());
	}

	@Test
	public void negativeCheckBalanceTest() {
		System.out.println("negative test for check balance");
		assertNotEquals(200, (int) accObj.checkBalance());
	}

}

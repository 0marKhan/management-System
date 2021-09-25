import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class withdrawalTest {

	private acc accObj;
	private String timeCheck;

	@Before
	public void beforeTest() {
		accObj = new acc();
		accObj.setBalance(500);

		// for getting current date
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		timeCheck = formatter.format(date);
	}

	@Test
	public void PositiveWithdrawalTest() {
		System.out.println("positive test for withdrawal");
		assertEquals(20, (int) accObj.makeWithdrawal(20));
		assertEquals(timeCheck, accObj.getTime());
		assertEquals(480, (int) accObj.checkBalance());
	}

	@Test
	public void NegativeWithdrawalTest() {
		String wrongDate = "monday";
		System.out.println("positive test for withdrawal");
		assertNotEquals(50, (int) accObj.makeWithdrawal(20));
		assertNotEquals(wrongDate, accObj.getTime());
		assertNotEquals(600, (int) accObj.checkBalance());
	}

}

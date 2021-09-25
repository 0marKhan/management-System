import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class makeWithdrawalTest {

	private acc obj;
	private String tmp;

	@Before
	public void setUp() {
		obj = new acc();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		tmp = formatter.format(date);

		obj.setBalance(1000);
		obj.makeWithdrawal(500);

	}

	@Test
	public void PosMakeWithdrawalTest() {
		assertEquals(tmp, obj.time);
		assertEquals(500, (int) obj.balance);
		assertEquals(500, (int) obj.makeWithdrawal(500));
	}

	@Test
	public void NegMakeWithdrawalTest() {
		assertNotEquals("monday", obj.time);
		assertNotEquals(200, (int) obj.balance);
		assertNotEquals(150, (int) obj.makeWithdrawal(500));
	}

}

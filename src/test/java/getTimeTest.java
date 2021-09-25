import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class getTimeTest {

	private acc accObj;
	private String tmp;

	@Before
	public void beforeTest() {
		accObj = new acc();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		tmp = formatter.format(date);
		accObj.time = tmp;
	}

	// for positive case
	@Test
	public void PositiveGetTimeTest() {
		System.out.println("positive test cases for getting time");
		assertEquals(tmp, accObj.time);
	}

	// for negative case
	@Test
	public void NegativeGetTimeTest() {
		System.out.println("negative test cases for getting time");
		assertNotEquals(123, accObj.time);
	}

}

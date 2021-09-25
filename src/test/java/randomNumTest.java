import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class randomNumTest {

	private int tmp;
	private acc Obj;

	@Before
	public void setUp() {
		Obj = new acc();
		Random r = new Random(System.currentTimeMillis());
		tmp = ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
	}

	@Test
	public void PosRandomNumTest() {
		assertEquals(tmp, Obj.randomNum());
	}

	@Test
	public void NegRandomNumTest() {
		assertNotEquals(43253, Obj.randomNum());
	}

}

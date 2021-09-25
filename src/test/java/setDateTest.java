import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class setDateTest {

	private acc Obj;
	private LocalDate tmp;

	@Before
	public void setUp() {
		Obj = new acc();
		Obj.setDate();
		tmp = java.time.LocalDate.now();
	}

	@Test
	public void PosSetMobTest() {
		assertNotNull(Obj.date);
		assertEquals(tmp, Obj.date);
	}

	@Test
	public void NegSetMobTest() {
		assertNotEquals(123, Obj.getMobileNumber());
	}

}

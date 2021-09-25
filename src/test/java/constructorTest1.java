import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class constructorTest1 {

	@Test
	public void PosConstructorTest1() {
		acc Obj = new acc();
		assertEquals("", Obj.getName());
		assertEquals("", Obj.getAddress());
		assertEquals(0, Obj.getMobileNumber());
		assertEquals(0, (int) Obj.balance);
	}

	@Test
	public void NegConstructorTest1() {
		acc Obj = new acc();
		assertNotEquals("hello", Obj.getName());
		assertNotEquals("oo", Obj.getAddress());
		assertNotEquals(12, Obj.getMobileNumber());
		assertNotEquals(5, (int) Obj.balance);
	}

}

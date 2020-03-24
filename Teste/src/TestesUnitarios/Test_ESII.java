package TestesUnitarios;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import Main.ESII;

public class Test_ESII {
	
	int a=0;
	int b=2;
	
	ESII e = new ESII(a, b);


	@Test
	public void testChange() {
		assertEquals(0,e.a);
		assertEquals(0,e.b);
		e.change(10);
		assertEquals(20,e.a);
		assertEquals(40,e.b);
	}

	@Test
	public void testGetA() {
		Assert.assertEquals(a,e.getA());
	}

	@Test
	public void testSetA() {
		e.setA(a);
	}

	@Test
	public void testGetB() {
		Assert.assertEquals(b,e.getB());
	}

	@Test
	public void testSetB() {
		e.setB(b);
	}

}

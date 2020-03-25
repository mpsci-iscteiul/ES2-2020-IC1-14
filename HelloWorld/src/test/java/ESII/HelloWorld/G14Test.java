package ESII.HelloWorld;

import static org.junit.Assert.*;

import org.junit.Test;

public class G14Test {

	
	int a=0;
	int b=2;
	
	G14 g = new G14(a, b); 

/**
 * testar change
 */
	@Test
	public void testChange() {
		assertEquals(0,g.a);
		assertEquals(0,g.b);
		g.change(10);
		assertEquals(20,g.a);
		assertEquals(40,g.b);
	}

	@Test
	public void testGetA() {
		assertEquals(a,g.getA());
	}

	@Test
	public void testSetA() {
		g.setA(a);
	}

	@Test
	public void testGetB() {
		assertEquals(b,g.getB());
	}

	@Test
	public void testSetB() {
		g.setB(b);
	}

}
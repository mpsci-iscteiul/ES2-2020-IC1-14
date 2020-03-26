package ESII.HelloWorld;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class G14Test {

	int a=0;
	int b=2;
	
	G14 g = new G14(a, b);


	@Test
	public void testChange() {
		assertEquals(0,g.a);
		assertEquals(2,g.b);
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

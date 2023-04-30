package model;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class CoordinateTest {
	
	@Test
	void testToString() {
		Coordinate c = new Coordinate(0, 0);
		assertEquals(c.toString(), "a1");
		c = new Coordinate(7, 7);
		assertEquals(c.toString(), "h8");
	}
}

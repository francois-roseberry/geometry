package app.geometry;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NothingTest {

	private Nothing nothing;

	@Before
	public void setup() {
		nothing = new Nothing();
	}

	@Test
	public void intersectingNothingShouldReturnNothing() {
		assertEquals(new Nothing(), nothing.intersect(new Nothing()));
	}

	@Test
	public void intersectingPointShouldReturnNothing() {
		assertEquals(new Nothing(), nothing.intersect(new Point(1, 2)));
	}

	@Test
	public void intersectingLineShouldReturnNothing() {
		assertEquals(new Nothing(), nothing.intersect(new Line(1, 2)));
	}
}

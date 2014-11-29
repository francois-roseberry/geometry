package app.geometry;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NothingTest {

	private Geometry.Nothing nothing;

	@Before
	public void setup() {
		nothing = Geometry.nothing();
	}

	@Test
	public void intersectingNothingShouldReturnNothing() {
		assertEquals(Geometry.nothing(), nothing.intersect(Geometry.nothing()));
	}

	@Test
	public void intersectingPointShouldReturnNothing() {
		assertEquals(Geometry.nothing(), nothing.intersect(new Point(1, 2)));
	}

	@Test
	public void intersectingLineShouldReturnNothing() {
		assertEquals(Geometry.nothing(), nothing.intersect(new Line(1, 2)));
	}
}

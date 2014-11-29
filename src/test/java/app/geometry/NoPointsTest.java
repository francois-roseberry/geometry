package app.geometry;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NoPointsTest {

	private NoPoints np;

	@Before
	public void setup() {
		np = new NoPoints();
	}

	@Test
	public void intersectingNoPointsShouldReturnNoPoints() {
		assertEquals(new NoPoints(), np.intersect(new NoPoints()));
	}

	@Test
	public void intersectingPointShouldReturnNoPoints() {
		assertEquals(new NoPoints(), np.intersect(new Point(1, 2)));
	}
}

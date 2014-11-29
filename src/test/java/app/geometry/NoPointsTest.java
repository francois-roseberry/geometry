package app.geometry;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NoPointsTest {
	@Test
	public void intersectingNoPointsWithNoPointsShouldReturnNoPoints() {
		assertEquals(new NoPoints(), new NoPoints().intersect(new NoPoints()));
	}
}

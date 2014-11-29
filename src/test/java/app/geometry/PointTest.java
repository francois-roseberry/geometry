package app.geometry;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PointTest {
	@Test
	public void intersectingNothingShouldReturnNothing() {
		assertEquals(new Nothing(), new Point(1, 2).intersect(new Nothing()));
	}

	@Test
	public void intersectingPointWithDifferentCoordinatesShouldReturnNothing() {
		assertEquals(new Nothing(), new Point(1, 2).intersect(new Point(1, 3)));
	}

	@Test
	public void intersectingPointWithSameCoordinatesShouldReturnSamePoint() {
		assertEquals(new Point(1, 2),
				new Point(1, 2).intersect(new Point(1, 2)));
	}

	@Test
	public void intersectingLineOnWhichItIsShouldReturnSamePoint() {
		assertEquals(new Point(1, 1), new Point(1, 1).intersect(new Line(1, 0)));
	}

	@Test
	public void intersectingLineOnWhichItIsNotShouldReturnNothing() {
		assertEquals(new Nothing(), new Point(1, 2).intersect(new Line(1, 0)));
	}
}

package app.geometry;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LineTest {
	@Test
	public void intersectingNothingShouldReturnNothing() {
		assertEquals(new Nothing(), new Line(1, 2).intersect(new Nothing()));
	}

	@Test
	public void intersectingPointOnLineShouldReturnSamePoint() {
		assertEquals(new Point(1, 1), new Line(1, 0).intersect(new Point(1, 1)));
	}

	@Test
	public void intersectingPointOutsideOfLineShouldReturnNothing() {
		assertEquals(new Nothing(), new Line(1, 0).intersect(new Point(1, 2)));
	}

	@Test
	public void intersectingLineWithSameSlopeAndInterceptShouldReturnSameLine() {
		assertEquals(new Line(1, 2), new Line(1, 2).intersect(new Line(1, 2)));
	}

	@Test
	public void intersectingParallelLineShouldReturnNothing() {
		assertEquals(new Nothing(), new Line(1, 2).intersect(new Line(1, 3)));
	}

	@Test
	public void intersectingNonParallelLineShouldReturnIntersectionPoint() {
		assertEquals(new Point(1, 3), new Line(1, 2).intersect(new Line(2, 1)));
	}
}
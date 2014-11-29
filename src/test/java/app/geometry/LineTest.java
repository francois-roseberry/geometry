package app.geometry;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;

import org.junit.Test;

import app.Environment;

public class LineTest {
	@Test
	public void evaluatingLineShouldReturnItself() {
		assertEquals(new Line(1, 2),
				new Line(1, 2).eval(any(Environment.class)));
	}

	@Test
	public void intersectingNothingShouldReturnNothing() {
		assertEquals(Geometry.nothing(),
				new Line(1, 2).intersect(Geometry.nothing()));
	}

	@Test
	public void intersectingPointOnLineShouldReturnSamePoint() {
		assertEquals(new Point(1, 1), new Line(1, 0).intersect(new Point(1, 1)));
	}

	@Test
	public void intersectingPointOutsideOfLineShouldReturnNothing() {
		assertEquals(Geometry.nothing(),
				new Line(1, 0).intersect(new Point(1, 2)));
	}

	@Test
	public void intersectingLineWithSameSlopeAndInterceptShouldReturnSameLine() {
		assertEquals(new Line(1, 2), new Line(1, 2).intersect(new Line(1, 2)));
	}

	@Test
	public void intersectingParallelLineShouldReturnNothing() {
		assertEquals(Geometry.nothing(),
				new Line(1, 2).intersect(new Line(1, 3)));
	}

	@Test
	public void intersectingNonParallelLineShouldReturnIntersectionPoint() {
		assertEquals(new Point(1, 3), new Line(1, 2).intersect(new Line(2, 1)));
	}
}

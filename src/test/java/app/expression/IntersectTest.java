package app.expression;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import app.Environment;
import app.geometry.Geometry;

public class IntersectTest {
	@Test
	public void evaluatingShouldReturnResultOfIntersectingLeftEvaluationWithRightEvaluation() {
		Environment environment = mock(Environment.class);

		Expression left = mock(Expression.class);
		Geometry leftGeometry = mock(Geometry.class);
		when(left.eval(environment)).thenReturn(leftGeometry);

		Expression right = mock(Expression.class);
		Geometry rightGeometry = mock(Geometry.class);
		when(right.eval(environment)).thenReturn(rightGeometry);

		Geometry result = mock(Geometry.class);
		when(leftGeometry.intersect(rightGeometry)).thenReturn(result);

		assertEquals(result, new Intersect(left, right).eval(environment));
	}
}

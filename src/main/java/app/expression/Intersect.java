package app.expression;

import app.Environment;
import app.geometry.Geometry;

public class Intersect implements Expression {
	private final Expression left;
	private final Expression right;

	public Intersect(final Expression left, final Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public Geometry eval(final Environment environment) {
		return left.eval(environment).intersect(right.eval(environment));
	}
}

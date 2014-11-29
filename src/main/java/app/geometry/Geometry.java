package app.geometry;

import app.Environment;
import app.expression.Expression;

public abstract class Geometry implements Expression {

	public static Nothing nothing() {
		return new Nothing();
	}

	@Override
	public Geometry eval(final Environment environment) {
		return this; // All geometry values evaluate to themselves
	}

	public Geometry intersect(final Geometry geometry) {
		return geometry.intersect(this);
	}

	public Geometry intersect(final Nothing nothing) {
		return nothing();
	}

	public Geometry intersect(final Point point) {
		return nothing();
	}

	public Geometry intersect(final Line line) {
		return nothing();
	}

	public static class Nothing extends Geometry {

		private Nothing() {
			// Prevents instanciation outside of Geometry class
		}

		@Override
		public boolean equals(final Object o) {
			return o instanceof Nothing;
		}

		@Override
		public String toString() {
			return "Nothing";
		}
	}
}

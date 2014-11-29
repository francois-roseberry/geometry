package app.geometry;

public class Nothing implements Geometry {

	@Override
	public Geometry intersect(final Geometry geometry) {
		return geometry.intersect(this);
	}

	@Override
	public Geometry intersect(final Nothing nothing) {
		return this;
	}

	@Override
	public Geometry intersect(final Point point) {
		return this;
	}

	@Override
	public Geometry intersect(final Line line) {
		return this;
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

package app.geometry;

public abstract class Geometry {

	public Geometry intersect(final Geometry geometry) {
		return geometry.intersect(this);
	}

	public Geometry intersect(final Nothing nothing) {
		return new Nothing();
	}

	public Geometry intersect(final Point point) {
		return new Nothing();
	}

	public Geometry intersect(final Line line) {
		return new Nothing();
	}
}

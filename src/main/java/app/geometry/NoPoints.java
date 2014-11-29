package app.geometry;

public class NoPoints implements Geometry {

	public Geometry intersect(final Geometry geometry) {
		return geometry.intersect(this);
	}

	public Geometry intersect(final NoPoints np) {
		return this;
	}

	public Geometry intersect(final Point point) {
		return this;
	}

	@Override
	public boolean equals(final Object o) {
		return o instanceof NoPoints;
	}
}

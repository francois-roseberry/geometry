package app.geometry;

public class Nothing implements Geometry {

	public Geometry intersect(final Geometry geometry) {
		return geometry.intersect(this);
	}

	public Geometry intersect(final Nothing np) {
		return this;
	}

	public Geometry intersect(final Point point) {
		return this;
	}

	@Override
	public boolean equals(final Object o) {
		return o instanceof Nothing;
	}
}

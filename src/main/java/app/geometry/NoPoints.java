package app.geometry;

public class NoPoints implements Geometry {

	public Geometry intersect(final Geometry geometry) {
		return geometry.intersect(this);
	}

	public Geometry intersect(final NoPoints np) {
		return np;
	}
}

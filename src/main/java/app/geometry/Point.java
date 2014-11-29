package app.geometry;

public class Point implements Geometry {

	private final int x;
	private final int y;

	public Point(final int x, final int y) {
		this.x = x;
		this.y = y;
	}

	public Geometry intersect(final Geometry geometry) {
		return geometry.intersect(this);
	}

	public Geometry intersect(final NoPoints np) {
		return np.intersect(this); // Use commutative operation
	}

	public Geometry intersect(final Point point) {
		if (x == point.x && y == point.y) {
			return this;
		}

		return new NoPoints();
	}

	@Override
	public boolean equals(final Object o) {
		if (!(o instanceof Point)) {
			return false;
		}

		Point other = (Point) o;
		return x == other.x && y == other.y;
	}
}

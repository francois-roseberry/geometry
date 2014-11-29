package app.geometry;

public class Point extends Geometry {

	private final int x;
	private final int y;

	public Point(final int x, final int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public Geometry intersect(final Point point) {
		if (x == point.x && y == point.y) {
			return this;
		}

		return new Nothing();
	}

	@Override
	public Geometry intersect(final Line line) {
		if (y == line.getSlope() * x + line.getIntercept()) {
			return this;
		}

		return new Nothing();
	}

	@Override
	public boolean equals(final Object o) {
		if (!(o instanceof Point)) {
			return false;
		}

		Point other = (Point) o;
		return x == other.x && y == other.y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}

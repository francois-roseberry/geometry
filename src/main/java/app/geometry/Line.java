package app.geometry;

public class Line extends Geometry {

	private final int slope;
	private final int intercept;

	public Line(final int slope, final int intercept) {
		this.slope = slope;
		this.intercept = intercept;
	}

	public int getSlope() {
		return slope;
	}

	public int getIntercept() {
		return intercept;
	}

	@Override
	public Geometry intersect(final Point point) {
		return point.intersect(this); // Use commutative operation
	}

	@Override
	public Geometry intersect(final Line line) {
		if (slope == line.slope) {
			if (intercept == line.intercept) {
				return this; // Same line
			}

			return Geometry.nothing(); // Parallel lines do not intersect
		}

		int x = (line.intercept - intercept) / (slope - line.slope);
		int y = slope * x + intercept;
		return new Point(x, y); // Non-parallel lines will always intersect
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof Line)) {
			return false;
		}

		Line line = (Line) other;
		return slope == line.slope && intercept == line.intercept;
	}

	@Override
	public String toString() {
		return "Line [slope=" + slope + ", intercept=" + intercept + "]";
	}
}

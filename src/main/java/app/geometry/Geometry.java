package app.geometry;

public interface Geometry {
	static float EPSILON = 0.0001f;

	Geometry intersect(Geometry geometry);

	Geometry intersect(NoPoints np);

	Geometry intersect(Point point);
}

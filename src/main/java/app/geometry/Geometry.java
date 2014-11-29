package app.geometry;

public interface Geometry {

	Geometry intersect(Geometry geometry);

	Geometry intersect(Nothing nothing);

	Geometry intersect(Point point);

	Geometry intersect(Line line);
}

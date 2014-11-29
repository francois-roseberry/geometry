package app.geometry;

public interface Geometry {

	Geometry intersect(Geometry geometry);

	Geometry intersect(Nothing np);

	Geometry intersect(Point point);
}

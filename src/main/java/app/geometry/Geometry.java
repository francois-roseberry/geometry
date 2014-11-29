package app.geometry;

public interface Geometry {
	Geometry intersect(Geometry geometry);

	Geometry intersect(NoPoints np);
}

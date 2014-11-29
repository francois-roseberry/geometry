package app.geometry;

public class Nothing extends Geometry {

	@Override
	public boolean equals(final Object o) {
		return o instanceof Nothing;
	}

	@Override
	public String toString() {
		return "Nothing";
	}
}

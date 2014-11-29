package app.expression;

import app.Environment;
import app.geometry.Geometry;

public interface Expression {
	Geometry eval(Environment environment);
}

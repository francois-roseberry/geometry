package app;

import app.geometry.Geometry;

import com.google.common.collect.ImmutableMap;

public class Environment {
	private final ImmutableMap<String, Geometry> mappings;

	public Environment(final ImmutableMap<String, Geometry> mappings) {
		this.mappings = mappings;
	}
}

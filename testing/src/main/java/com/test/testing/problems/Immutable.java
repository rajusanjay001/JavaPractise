package com.test.testing.problems;

final class Immutable {

	final private int id;
	final private String name;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	Immutable(int id, String name) {
		this.id = id;
		this.name = name;
	}

}

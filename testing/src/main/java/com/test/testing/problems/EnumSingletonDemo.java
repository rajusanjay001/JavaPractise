package com.test.testing.problems;

public enum EnumSingletonDemo {
	INSTANCE;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String name;

}

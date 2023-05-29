package com.test.testing.problems.factory;

public class CheesePizza implements Pizza {

	@Override
	public void prepare() {

		System.out.println("preparing cheeze pizza");
	}

	@Override
	public void bake() {
		System.out.println("Baking cheeze pizza");
	}

	@Override
	public void cut() {
		System.out.println("cutting cheeze pizza");
	}

}

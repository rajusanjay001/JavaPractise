package com.test.testing.problems.factory;

public class VegPizza implements Pizza {

	@Override
	public void prepare() {

		System.out.println("preparing Veg pizza");
	}

	@Override
	public void bake() {
		System.out.println("Baking Veg pizza");
	}

	@Override
	public void cut() {
		System.out.println("cutting Veg pizza");
	}


}

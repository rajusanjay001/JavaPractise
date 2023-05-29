package com.test.testing.problems.factory;

public class Chicken implements Pizza {

	@Override
	public void prepare() {

		System.out.println("preparing Chicken pizza");
	}

	@Override
	public void bake() {
		System.out.println("Baking Chicken pizza");
	}

	@Override
	public void cut() {
		System.out.println("cutting Chicken pizza");
	}
}

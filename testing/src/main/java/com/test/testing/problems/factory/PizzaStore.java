package com.test.testing.problems.factory;

public class PizzaStore {

	public Pizza orderPizza(String type) {
		Pizza p = null;
		switch (type) {
		case "cheese":
			p = new CheesePizza();
			break;
		case "veg":
			p = new VegPizza();
			break;
		case "chicken":
			p = new Chicken();
			break;

		}
		return p;
	}

}

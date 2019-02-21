package com.training.patterns.structural.decorator.pizza;

public class ExtraMushroom extends Pizza {
	private Pizza pizza;

	public ExtraMushroom(final Pizza pizza) {
		super(0);
		this.pizza = pizza;
	}

	@Override
	public int getCost() {
		return this.pizza.getCost() + 7;
	}

}

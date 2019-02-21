package com.training.patterns.structural.decorator.pizza;

public class ExtraCheese extends Pizza {
	private Pizza pizza;

	public ExtraCheese(final Pizza pizza) {
		super(0);
		this.pizza = pizza;
	}

	@Override
	public int getCost() {
		return this.pizza.getCost() + 3;
	}

}

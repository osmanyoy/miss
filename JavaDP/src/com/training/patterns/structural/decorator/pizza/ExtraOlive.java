package com.training.patterns.structural.decorator.pizza;

public class ExtraOlive extends Pizza {
	private Pizza pizza;

	public ExtraOlive(final Pizza pizza) {
		super(0);
		this.pizza = pizza;
	}

	@Override
	public int getCost() {
		return this.pizza.getCost() + 5;
	}

}

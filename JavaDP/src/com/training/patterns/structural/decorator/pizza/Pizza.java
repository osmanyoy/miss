package com.training.patterns.structural.decorator.pizza;

public abstract class Pizza {
	private int cost;

	public Pizza(final int cost) {
		this.cost = cost;
	}

	public int getCost() {
		return this.cost;
	}

}

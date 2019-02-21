package com.training.patterns.structural.decorator.pizza;

public class Runner {
	public static void main(final String[] args) {
		Pizza pizza = new KucukPizza();
		pizza = ExtraFactory.addExtra(pizza,
		                              1);
		pizza = ExtraFactory.addExtra(pizza,
		                              2);
		pizza = ExtraFactory.addExtra(pizza,
		                              3);

		System.out.println(pizza.getCost());
	}
}

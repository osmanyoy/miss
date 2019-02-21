package com.training.patterns.structural.decorator.pizza;

public class ExtraFactory {

	public static Pizza addExtra(final Pizza pizza, final int extraType) {
		switch (extraType) {
		case 1:
			return new ExtraCheese(pizza);
		case 2:
			return new ExtraOlive(pizza);
		case 3:
			return new ExtraMushroom(pizza);

		default:
			return pizza;
		}
	}
}

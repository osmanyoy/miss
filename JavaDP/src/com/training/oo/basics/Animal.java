package com.training.oo.basics;

public class Animal implements IAnimal {

	private static final String NAME = "name";

	protected String name;

	@Override
	public String move(final int metre) {
		return this.name + "I move to " + metre;
	}

	@Override
	public String say() {
		return null;
	}

}

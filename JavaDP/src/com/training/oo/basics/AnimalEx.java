package com.training.oo.basics;

public class AnimalEx extends Animal {

	protected String name;

	@Override
	public String move(final int metre) {
		String move = super.move(metre);

		return super.name + move;
	}

	public String talk() {
		return "I am talking";
	}

}

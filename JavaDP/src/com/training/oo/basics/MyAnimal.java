package com.training.oo.basics;

public class MyAnimal extends AbstractAnimal {

	public MyAnimal(final int height) {
		super(height);
	}

	@Override
	public String move(final int m) {
		return "Gidiyorum " + m;
	}

	@Override
	public String getName() {
		return null;
	}

}

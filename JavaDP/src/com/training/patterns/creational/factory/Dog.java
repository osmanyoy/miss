package com.training.patterns.creational.factory;

import com.training.oo.basics.AbstractAnimal;

public class Dog extends AbstractAnimal {

	public Dog() {
		super(70);
	}

	@Override
	public String move(final int m) {
		return "Dört ayak koþuyorum";
	}

	@Override
	public String getName() {
		return "köpek";
	}

}

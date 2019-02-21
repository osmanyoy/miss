package com.training.patterns.creational.factory;

import com.training.oo.basics.AbstractAnimal;

public class Cat extends AbstractAnimal {

	public Cat() {
		super(50);
	}

	@Override
	public String move(final int m) {
		return "Dört ayak koþuyorum";
	}

	@Override
	public String getName() {
		return "kedi";
	}

}
